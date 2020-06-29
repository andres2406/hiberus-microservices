FROM openjdk:8

RUN mkdir -p \opt\ms\ms-checkout-checkoutservice

WORKDIR \opt\ms\ms-checkout-checkoutservice

# --------------------------------
# Copy scripts, packages & plugins
# --------------------------------
COPY target\ms-checkout-checkoutservice.jar \opt\ms\ms-checkout-checkoutservice\
COPY src\main\resources\application.properties \opt\ms\ms-checkout-checkoutservice

#-----------------------
# Expose container ports
# ----------------------
EXPOSE 8084

ENTRYPOINT java -jar \opt\ms\ms-checkout-checkoutservice\ms-checkout-checkoutservice.jar
