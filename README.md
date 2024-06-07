# demo-spring-oauth-server

## Add new line

curl http://localhost:8080/.well-known/openid-configuration | jq

## challenge: ZPIZadfkyvEOqINdUsCc86zf4snKm-5bkqNnB1BDyB0
## verifier: Mxk_tq3oZn-P-xG96Rw_mnJtqpszSj9OOt_NF9sN0fY

http://localhost:8080/oauth2/authorize?response_type=code&client_id=client&scope=openid&redirect_uri=https://www.manning.com/authorized&code_challenge=QYPAZ5NU8yvtlQ9erXrUYR-T5AGCjCF47vN-KsaI2A8&code_challenge_method=S256


http://localhost:8080/oauth2/authorize?response_type=code&client_id=client&scope=openid&redirect_uri=https://www.google.com&code_challenge=ZPIZadfkyvEOqINdUsCc86zf4snKm-5bkqNnB1BDyB0&code_challenge_method=S256


curl -X POST 'http://localhost:8080/oauth2/token?client_id=client&redirect_uri=https://www.manning.com/authorized&grant_type=authorization_code&code=ao2oz47zdM0D5gbAqtZVB…code_verifier=Mxk_tq3oZn-P-xG96Rw_mnJtqpszSj9OOt_NF9sN0fY --header 'Authorization: Basic Y2xpZW50OnNlY3JldA=='


![img.png](img.png)