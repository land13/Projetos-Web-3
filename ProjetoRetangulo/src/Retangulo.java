/**
 * @author Gabriel Land
 * @since 23:32 - 21/11/2021
 * @version 1.0
 */
public class Retangulo {

    private double lado1;
    private double lado2;

    /**
     * construtor vazio
     */
    public Retangulo() {
    }

    /**
     *
     * @return retorna o lado 1 do retangulo
     */
    public double getLado1() {
        return lado1;
    }

    /**
     *
     * @param lado1 recebe o lado 1 do retangulo
     */
    public void setLado1(double lado1) {
        this.lado1 = lado1;
    }

    /**
     *
     * @return retorna o lado 2 do retangulo
     */
    public double getLado2() {
        return lado2;
    }

    /**
     *
     * @param lado2 recebe o lado 2 do retangulo
     */
    public void setLado2(double lado2) {
        this.lado2 = lado2;
    }

    /**
     *
     * @return retorna o calculo da area do retangulo
     */
    public double calcularAreaDoRetangulo() {
        return this.lado1 * this.lado2;
    }

    /**
     *
     * @return retorna o calculo do perimetro do retangulo
     */
    public double calcularPerimetroDoRetangulo() {
        return 2 * (this.lado1 + this.lado2);
    }

    /**
     *
     * @return retorna o lado 1, lado 2, area e perimetro do retangulo
     */
    @Override
    public String toString() {
        return  "\nlado 1: " + this.lado1 +
                "\nlado 2: " + this.lado2 +
                "\nArea: " + calcularAreaDoRetangulo() +
                "\nPerimetro: " + calcularPerimetroDoRetangulo();
    }
}
