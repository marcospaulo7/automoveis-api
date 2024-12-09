Evidencias dos metodos:

POST:
Curl do cenario:

curl --location --request POST 'http://localhost:8080/v1/automoveis' \
--header 'Content-Type: application/json' \
--data-raw '{
    "marca": "ferrari",
    "modelo": "modelo 1",
    "valor": 1000.00
}'

evidencia:
![image](https://github.com/user-attachments/assets/c373003a-eb2d-426e-908d-a089880946cf)


GET ALL:
Curl do cenario:
curl --location --request GET 'http://localhost:8080/v1/automoveis'

evidencia:
![image](https://github.com/user-attachments/assets/dbd9d137-b393-473c-a792-3d78dd99290b)


GET BY ID:
Curl do cenario:

curl --location --request GET 'http://localhost:8080/v1/automoveis/1'

Evidencia status 200
![image](https://github.com/user-attachments/assets/80c08488-eabe-44b5-ac2e-205c3ad03f6d)

Evidencia status 404:
![image](https://github.com/user-attachments/assets/d33da0ad-6760-4e13-8150-255574d6b5cc)


Evidencia do H2:
![image](https://github.com/user-attachments/assets/717d678c-5f37-4ead-bcb9-7adcf27ef5a8)

