# qa-final-project-java
Acest proiect este un exemplu de automatizare QA folosind Java, Maven și Docker.

Proiectul include:
Structura standard pentru proiecte Java/Maven pentru testare.
Test API (pseudocod) care verifică endpoint-ul: https://jsonplaceholder.typicode.com/todos/1.
Fișier de configurare YAML (config/app.yaml) pentru mediul de test și URL-ul serviciului.
Dockerfile pentru containerizarea proiectului.
Pipeline CI/CD GitHub Actions care rulează testele Maven și publică imaginea Docker pe Docker Hub.

Rulează testele Maven: mvn test

Cum se construiește și rulează imaginea Docker:
docker build -t qa-final-project-java .
docker run --rm qa-final-project-java

[![CI Pipeline for QA Project](https://github.com/topolnicianupetronela-sys/qa-final-project-java/actions/workflows/ci.yml/badge.svg)](https://github.com/topolnicianupetronela-sys/qa-final-project-java/actions/workflows/ci.yml)
