 public class ProjectorCinema implements ServeiReproductor \{\
    public void reproduir()                  \{ System.out.println("Projector: reproduint"); \}\
    public void aturar()                     \{ System.out.println("Projector: aturat"); \}\
    public void ajustarVolum(int nivell)     \{ System.out.println("So de sala: volum " + nivell); \}\
    public void activarSubtitols(String i)   \{ System.out.println("Projecci\'f3: subt\'edtols " + i); \}\
    public void enviarAlTelevisio()          \{ throw new UnsupportedOperationException("Projector \uc0\u8800  Chromecast"); \}\
    public void descarregarFitxer()          \{ throw new UnsupportedOperationException("Projector no descarrega"); \}\
\}