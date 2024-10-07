import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.junit.Test;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;
import models.User;

public class ApiTest {

    @Test
    public void testCreateUser() {
        // Definir a URI base da API
        baseURI = "https://reqres.in/api/users";

        // Criar um objeto User
        User user = new User("morpheus", "leader");

        // Enviar a requisição POST
        Response response = given()
                .contentType("application/json")
                .body(user) // Corpo da requisição com o objeto User
                .when()
                .post("users")  // Endpoint para criar usuário
                .then()
                .statusCode(201)  // Validar status code 201 (Created)
                .body("name", equalTo(user.getName()))  // Validar campo "name"
                .body("job", equalTo(user.getJob()))  // Validar campo "job"
                .extract().response();

        // Opcional: Imprimir a resposta no console
        System.out.println(response.asString());
    }
}