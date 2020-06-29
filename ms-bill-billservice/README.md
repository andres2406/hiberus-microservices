# ms-bill-billservice

Steps for deployment.

1. Compilation.
2. Image creation.
3. see image created
4. tear off our container.
5. use the app

# Compilation

mvn clean install

Generates the component "ms-bill-billservice.jar"

Starting Class: co.hiberus.bill.MsBillBillserviceApplication

Protocol: HTTP


Internal port: 8082

# Image creation

docker build -t ms-bill-billservice:1.0.0 .

#see image created

docker images

# tear off our container
docker run -p 8082:8082 ms-bill-billservice:1.0.0

# use the app

localhost:8082/api/bill/cost

request body: receives a list of products of the ProductDTO type
[
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

response: sum cost of the products on the list: 41500




