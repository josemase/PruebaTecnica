# PruebaTecnica
Parameta

To consume the REST API, which in turn will consume a SOAP web service for storing an employee-type object/entity, the process can be done in the following way:

First, clone the repository to your local machine.
Making sure you have Maven installed, and in this path C:\Users\josef\Desktop\review\PruebaTecnica\test\src\main\resources\application.properties, please configure your mysql database credentials.
You don´t need to create the database, because I shared the database file (.sql) in the path "PruebaTecnica\parameta_empleado.sql", you can  AWNQ   use it.
Open a terminal and navigate to the root directory of the project.
Run the following command to build the project:

mvn clean install

After the project is built, run the following command to start the application:

mvn spring-boot:run

The application will start and will be available at the following URL:

POST Method
http://localhost:8080/?Nombres=John&Apellidos=Doe&TipoDocumento=CC&NDocumento=101564&FechaNacimiento=2000-09-18&FechaVinculacion=2020-07-24&Cargo=Developer&Salario=1000000

As you know the Rest service recieve as parameter the Empleado object attributes. The attributes are: Nombres, Apellidos, TipoDocumento, NDocumento, FechaNacimiento, FechaVinculacion, Cargo, Salario. The values are separated by "&" and the attribute name and value are separated by "=". 
Although the requirement specifies that the REST API should be of type GET, remember that for the addition or creation of any entity or information, the correct method to use is POST. The GET method is only used to retrieve information, not to create, save, or publish it.
You can consume the service in postman or other tool for consume web services.

Additionally, if you wish to consume the SOAP service alone, it can be done as follows:

POST Method
http://localhost:8080/ws
HEADERS
Content-Type = text/xml
BODY:
   <soapenv:Envelope xmlns:soapenv="http://schemas.xmlsoap.org/soap/envelope/" xmlns:test="http://parameta.com/test">
   <soapenv:Header/>
   <soapenv:Body>
      <test:addEmpleadoRequest>
         <test:name>jhon</test:name>
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

(remember to change the values of the body to the desired ones, and the project should be running when you consume any service REST or SOAP)
For any questions or concerns, please contact Jose Fernando Martinez Seco.
phone: 3012107740
email: joseferms.jfm@gmail.com
