# Bank account SOAP service

A small SOAP web service in Java, built for a service-oriented architecture (SOA) course. It lets a client create bank accounts and list them, and it's meant to be used as a black box through its WSDL.

## Operations

`GestionCompte` (`src/main/java/org/example/service/GestionCompte.java`) is a JAX-WS `@WebService` with two operations:

| Operation | Input | Output |
| --- | --- | --- |
| `CreaetionCompte` | account code (int), owner name (string) | confirmation message |
| `ListeCompte` | none | list of accounts (`Compte`: code, owner, balance, creation date) |

It also has a helper, `Conversion`, that converts an amount at a fixed rate of 3.5.

## Run it

You need Java and Maven. JAX-WS was removed from the JDK in Java 11, so on newer Java versions add the JAX-WS runtime (`com.sun.xml.ws:jaxws-rt`) to `pom.xml`, or run it on Java 8. Publish the service with the JAX-WS `Endpoint` API, for example from a `main` method:

```java
Endpoint.publish("http://localhost:8888/GestionCompteService", new GestionCompte());
```

Then open the WSDL at `http://localhost:8888/GestionCompteService?wsdl` and call the operations with a SOAP client such as SoapUI.

**Stack:** Java, JAX-WS (`javax.jws`), Maven

---

Built by Achraf Aroua · [Portfolio](https://achref-2.github.io)
