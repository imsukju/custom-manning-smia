package com.optimagrowth.organization.controller;

import jakarta.servlet.http.HttpServletRequest;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.optimagrowth.organization.model.Organization;
import com.optimagrowth.organization.service.OrganizationService;

@RestController
@RequestMapping(value="v1/organization")
@Slf4j
public class OrganizationController {
    @Autowired
    private OrganizationService service;


    @RequestMapping(value="/{organizationId}",method = RequestMethod.GET)
    public ResponseEntity<Organization> getOrganization(@PathVariable("organizationId") String organizationId,
                                                        @RequestHeader("tmx-correlation-id")String userAgent
    , HttpServletRequest request) {
        String Hello = userAgent;
        String HEllo2 = request.getHeaderNames().nextElement();
        String Heelo3 = request.getHeaderNames().toString();

        log.info(Hello);
        log.info(HEllo2);
        log.info(Heelo3);
        return ResponseEntity.ok(service.findById(organizationId));
    }

    @RequestMapping(value="/{organizationId}",method = RequestMethod.PUT)
    public void updateOrganization( @PathVariable("organizationId") String id, @RequestBody Organization organization) {
        service.update(organization);
    }

    @PostMapping
    public ResponseEntity<Organization>  saveOrganization(@RequestBody Organization organization) {
    	return ResponseEntity.ok(service.create(organization));
    }

    @RequestMapping(value="/{organizationId}",method = RequestMethod.DELETE)
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteOrganization( @PathVariable("id") String id,  @RequestBody Organization organization) {
        service.delete(organization);
    }

}
