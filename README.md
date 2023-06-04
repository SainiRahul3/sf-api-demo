# sf-api-demo
SourceFuze API Demo

For Windows: Start Docker Desktop and then issue the below docker commands at the root of the application

To Build the application

```
mvn clean package -DskipTests
```

To create the DB (pulls postgres 12 DB Image from Docker Registry for a local Docker Postgres DB setup)
```
docker compose up -d demo_app_db
```

To start the application (will publish to Docker Registry)
```
docker compose up -d sf_api_demo_app
```
