# REST API - H2 - JPA - SpringBoot

### Start settings
`Java 16`
`Spring version 2.5.3`



Simple API to create, edit, delete and update fictitious person data for software engineering exercises.

### Show all registered customers Endpoint

`GET /cliente`

    In Postman or Web Browser you can use the following line. http://localhost:8080/cliente/

### Response

    Return json with costumers add in http 200 status ok.

## Create a new person

### Request

`POST /cliente`

    ENDPOINT: http://localhost:8080/cliente
    using this body(ID is automatically generated for the registration.): 
                         {
                           "nome": "Jojojn babab",
                           "dataNascimento": "05/09/1995",
                           "logradouro": "Rua",
                           "endereco": "Edson luis",
                           "cep": "43700-000",
                           "numero": "000",
                           "cidade": "simoes"
                         }

### Response

    HTTP/1.1 201 Created
    Date: Thu, 24 Feb 2011 12:36:30 GMT
    Status: 201 Created
    Connection: close
    Content-Type: application/json
    Location: /cliente/1
    Content-Length: 36

    {"id":1,"nome":"Jojojn babab","dataNascimento":"05/09/1995","logradouro":"Rua","endereco":"Edson luis","cep":"43700-000","numero":"000","cidade":"simoes"}

## Get a specific Person

### Request

`GET /cliente/id`

     http://localhost:8080/cliente/1

### Response

    HTTP/1.1 200 OK
    Date: Thu, 24 Feb 2011 12:36:30 GMT
    Status: 200 OK
    Connection: close
    Content-Type: application/json
    Content-Length: 36

    {"id":1,"nome":"Jojojn babab","dataNascimento":"05/09/1995","logradouro":"Rua","endereco":"Edson luis",
    "cep":"43700-000","numero":"000","cidade":"simoes"}

## Get a non-existent Person

### Request

`GET /cliente/id`

     http://localhost:8080/cliente/9999

### Response

    HTTP/1.1 404 Not Found
    Date: Thu, 24 Feb 2011 12:36:30 GMT
    Status: 404 Not Found
    Connection: close
    Content-Type: application/json
    Content-Length: 35

    {"status":404,"reason":"Not found"}

## Create another new Person

### Request

`POST /cliente`

     http://localhost:8080/cliente

### Response

    HTTP/1.1 201 Created
    Date: Thu, 24 Feb 2011 12:36:31 GMT
    Status: 201 Created
    Connection: close
    Content-Type: application/json
    Location: /thing/2
    Content-Length: 35

    {"id":2,"nome":"x","dataNascimento":"05/09/1995","logradouro":"xxx","endereco":"xxxxx",
    "cep":"43700-000","numero":"222","cidade":"ivejwhviwej"}


## Update Person Adress

### Request

`PUT /cliente/id`

    ENDPOINT: http://localhost:8080/cliente/id
    Request Body:
        {
        "nome": "new info",
        "dataNascimento": "new info",
        "logradouro": "new info",
        "endereco": "new info",
        "cep": "new info",
        "numero": "new info",
        "cidade": "new info"
        }

### Response

    HTTP/1.1 204 NO CONTENT
    Date: Thu, 24 Feb 2011 12:36:31 GMT
    Status: 204 OK
    Connection: close
    Content-Type: application/json
    Content-Length: 74

    [{"nome": "new info","dataNascimento": "new info","logradouro": "new info", "endereco": "new info",
        "cep": "new info","numero": "new info","cidade": "new info"}]

## Delete a Person

### Request

`DELETE /cliente/id/`

    PUT http://localhost:8080/cliente/ID
    Request Body:
        {
        "id": 1  <- cliente ID number to remove.
        }

### Response

    HTTP/1.1 204 NO CONTENT
    Date: Thu, 24 Feb 2011 12:36:31 GMT
    Status: 204 OK
    Connection: close

#