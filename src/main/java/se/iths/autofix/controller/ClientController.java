package se.iths.autofix.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;
import se.iths.autofix.entity.Client;
import se.iths.autofix.service.ClientService;

import javax.annotation.security.RolesAllowed;
import java.util.Optional;

@RestController
@RequestMapping("/client")
public class ClientController {

    Logger logger = LoggerFactory.getLogger(ClientController.class);

    private ClientService clientService;

    public ClientController(ClientService clientService) {
        this.clientService = clientService;
    }

    @PostMapping("/create")
    public Client createClient(@RequestBody Client client) {
//           logger.trace("Vi loggar på TRACE-nivå");
//           logger.debug("Vi loggar på DEBUG-nivå");
           logger.info("createClient() was called with username: " + client.getUsername());
//           logger.warn("Vi loggar på WARN-nivå");
//           logger.error("Vi loggar på ERROR-nivå");
           return clientService.createClient(client);
    }


    @GetMapping("/findall")
    @RolesAllowed("ADMIN")
    @PreAuthorize("hasRole('ADMIN')")
    public Iterable<Client> findAllClients() {
        return clientService.findAllClients();
    }

    @GetMapping("/id/{id}")
    public Optional<Client> findClientById(@PathVariable Long id) {
        return clientService.findClientById(id);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteClient(@PathVariable Long id) {
        clientService.deleteClient(id);
    }

    @GetMapping("/getauthenticatedclient")
    public Client getAuthenticatedClient() {
        return clientService.getAuthenticatedClient();
    }

}
