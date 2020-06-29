# ms-checkout-checkoutservice

Steps for deployment.

1. Compilation.
2. Image creation.
3. see image created
4. tear off our container.
5. use the app

# Compilation

mvn clean install

Generates the component "ms-checkout-checkoutservice.jar"

Starting Class: co.hiberus.checkout.MsCheckoutCheckoutserviceApplication

Protocol: HTTP


Internal port: 8084

# Image creation

docker build -t ms-checkout-checkoutservice:1.0.0 .

#see image created

docker images

# tear off our container
docker run -p 8084:8084 ms-checkout-checkoutservice:1.0.0 


# use the app

localhost:8084/api/checkout/receiveOrders

request body: checkout order, consumes two services rest ms-bill-billservice and 
ms-logistic-logisticservice

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
            "cost": 10000
        },
        {
            "id": 44548,
            "quantity": 2,
            "cost": 20000
        }
    ]
}

reponse: message "the order was successfully saved, the  total  is: 70000"
