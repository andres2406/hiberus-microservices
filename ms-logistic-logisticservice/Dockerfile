FROM openjdk:8

RUN mkdir -p \opt\ms\ms-logistic-logisticservice

WORKDIR \opt\ms\ms-logistic-logisticservice

# --------------------------------
# Copy scripts, packages & plugins
# --------------------------------
COPY target\ms-logistic-logisticservice.jar \opt\ms\ms-logistic-logisticservice\
COPY src\main\resources\application.properties \opt\ms\ms-logistic-logisticservice

#-----------------------
# Expose container ports
# ----------------------
EXPOSE 8083

ENTRYPOINT java -jar \opt\ms\ms-logistic-logisticservice\ms-logistic-logisticservice.jar
