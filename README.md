# micronaut-vault

Run vault in docker:

`docker run --cap-add=IPC_LOCK -e 'VAULT_DEV_ROOT_TOKEN_ID=myroot' -p 8200:8200 --name vault vault`

and access it:

`docker exec -it vault sh`

Then set up kv secret:

```
export VAULT_ADDR='http://0.0.0.0:8200'
export VAULT_TOKEN='myroot'
vault kv put secret/application test=testing
```

Run this application:

`./gradlew run`

The check the result:

`curl http://localhost:8080/test`

Should produce:

`{"vault-key-test":"testing"}`
