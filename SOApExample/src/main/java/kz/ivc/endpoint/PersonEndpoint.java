package kz.ivc.endpoint;


import kz.ivc.service.PersonService;
import kz.ivc.soapexample.GetPersonRequest;
import kz.ivc.soapexample.GetPersonResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;


@Endpoint
public class PersonEndpoint {

    @Autowired
    private PersonService personService;

    @Autowired
    public PersonEndpoint(PersonService personService){
        this.personService = personService;
    }

    @PayloadRoot(namespace = "http://ivc.kz/SOApExample", localPart = "getPersonRequest")
    @ResponsePayload
    public GetPersonResponse getPersonRequest(@RequestPayload GetPersonRequest request){
        GetPersonResponse response = new GetPersonResponse();
        response.setPerson(personService.getPersons(request.getName()));

        return response;
    }
}
