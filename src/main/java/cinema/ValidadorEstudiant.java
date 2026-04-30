
 public class ValidadorEstudiant \{\
    private String apiUrl;\
    private String token;\
\
    public ValidadorEstudiant(String apiUrl, String token) \{\
        this.apiUrl = apiUrl;\
        this.token = token;\
    \}\
\
    public boolean verificar(int clientId) \{\
        // Simulaci\'f3: en producci\'f3 faria una crida HTTP\
        return clientId % 2 == 0;\
    \}\
\}}