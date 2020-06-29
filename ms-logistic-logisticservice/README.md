# ms-logistic-logisticservice

Steps for deployment.

1. Compilation.
2. Image creation.
3. see image created
4. tear off our container.
5. use the app

# Compilation

mvn clean install

Generates the component "ms-logistic-logisticservice.jar"

Starting Class: co.hiberus.logistic.MsLogisticLogisticserviceApplication

Protocol: HTTP


Internal port: 8083

# Image creation

docker build -t ms-logistic-logisticservice:1.0.0 .

#see image created

docker images

# tear off our container
docker run -p 8083:8083 ms-logistic-logisticservice:1.0.0 

# use the app

localhost:8083/api/Logistic/createOrder

request body: receives an order and saves it

{
    "ClientDTO": {
        "id": 44545,
        "name": "Andres Villanueva",
        "telephone": 3229070033
    },
    "date": "2019-10-07",
    "direction": "manzana 13 casa 11",
    "listProduct": [
        {
            "id": 44545,
            "quantity": 3,
            "cost": 8500
        },
        {
            "id": 44548,
            "quantity": 2,
            "cost": 8000
        }
    ]
}
reponse: message "the order was successfully saved"
