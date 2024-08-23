#!/bin/bash

url="http://localhost:8080/api/v1/kafka/publish"
data='{ "id": 1, "firstName": "John", "lastName": "Doe" }'

curl -X POST \
     -H "Content-Type: application/json" \
     -d "$data" \
     "$url"