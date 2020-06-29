FROM openjdk:8

RUN mkdir -p \opt\ms\ms-bill-billservice

WORKDIR \opt\ms\ms-bill-billservice

# --------------------------------
# Copy scripts, packages & plugins
# --------------------------------
COPY target\ms-bill-billservice.jar \opt\ms\ms-bill-billservice\
COPY src\main\resources\application.properties \opt\ms\ms-bill-billservice

#-----------------------
# Expose container ports
# ----------------------
EXPOSE 8082

ENTRYPOINT java -jar \opt\ms\ms-bill-billservice\ms-bill-billservice.jar
