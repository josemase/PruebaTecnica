# PruebaTecnica
Parameta

To consume the REST API, which in turn will consume a SOAP web service for storing an employee-type object/entity, the process can be done as follows:

Since the requirement is for a REST service that receives the attributes as parameters, the consumption should be done as follows:

POST Method
http://localhost:8080/?Nombres=John&Apellidos=Doe&TipoDocumento=CC&NDocumento=101564&FechaNacimiento=2000-09-18&FechaVinculacion=2020-07-24&Cargo=Developer&Salario=1000000

Although the requirement specifies that the REST API should be of type GET, remember that for the addition or creation of any entity or information, the correct method to use is POST. The GET method is only used to retrieve information, not to create, save, or publish it.

Additionally, if you wish to consume the SOAP service, it can be done as follows:

POST Method
http://localhost:8080/ws
HEADERS
Content-Type = text/xml
Body:
   <soapenv:Envelope xmlns:soapenv="http://schemas.xmlsoap.org/soap/envelope/" xmlns:test="http://parameta.com/test">
   <soapenv:Header/>
   <soapenv:Body>
      <test:addEmpleadoRequest>
         <test:name>Joselin</test:name>
         <test:lastname>Doe</test:lastname>
         <test:role>Developer</test:role>
         <test:salary>50000</test:salary>
         <test:startDate>2023-01-01</test:startDate>
         <test:bornDate>1990-01-01</test:bornDate>
         <test:documentType>Passport</test:documentType>
         <test:documentNumber>5463653</test:documentNumber>
      </test:addEmpleadoRequest>
   </soapenv:Body>
</soapenv:Envelope>


For any questions or concerns, please contact Jose Fernando Martinez Seco, phone: 3012107740
