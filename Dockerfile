FROM mcr.microsoft.com/java/jre:13-zulu-alpine
COPY build/libs/demo*.jar /demo.jar
ENTRYPOINT [ "java", "-jar", "/demo.jar" ]