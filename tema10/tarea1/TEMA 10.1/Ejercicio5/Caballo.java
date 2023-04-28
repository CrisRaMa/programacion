package Tema9_2.Ejercicio5;

public class Caballo {
    
        private String nombre;
        private int edad;
        private double altura;
        private double peso;
        private String colorPelaje;
        private String raza;
        private char genero;
        private String estadoSalud;
        private String temperamento;
        private int nivelEntrenamiento;
        
        // Constructor
        public Caballo(String nombre, int edad, double altura, double peso, String colorPelaje, String raza, char genero, String estadoSalud, String temperamento, int nivelEntrenamiento) {
            this.nombre = nombre;
            this.edad = edad;
            this.altura = altura;
            this.peso = peso;
            this.colorPelaje = colorPelaje;
            this.raza = raza;
            this.genero = genero;
            this.estadoSalud = estadoSalud;
            this.temperamento = temperamento;
            this.nivelEntrenamiento = nivelEntrenamiento;
        }


        
        // Métodos de la clase
        public void caminar() {
            System.out.println("El caballo " + nombre + " está caminando.\n");
        }
        
        public void trotar() {
            System.out.println("El caballo " + nombre + " está trotando.\n");
        }
        
        public void galopar() {
            System.out.println("El caballo " + nombre + " está galopando.\n");
        }
        
        public void saltar() {
            System.out.println("El caballo " + nombre + " está saltando.\n");
        }
        
        public void tirarDeCarga() {
            System.out.println("El caballo " + nombre + " está tirando de una carga.\n");
        }
        
        public void pastar() {
            System.out.println("El caballo " + nombre + " está pastando.\n");
        }
        
        public void descansar() {
            System.out.println("El caballo " + nombre + " está descansando.\n");
        }
        
        public void serCepillado() {
            System.out.println("El caballo " + nombre + " está siendo cepillado.\n");
        }
        
        public void serAlimentado() {
            System.out.println("El caballo " + nombre + " está siendo alimentado.\n");
        }
        
        public void serEntrenado() {
            System.out.println("El caballo " + nombre + " está siendo entrenado.\n");
        }
        
        public void competir() {
            System.out.println("El caballo " + nombre + " está compitiendo.\n");
        }
        
        public void recibirAtencionVeterinaria() {
            System.out.println("El caballo " + nombre + " está recibiendo atención veterinaria.\n");
        }
    
    /**
     * @return String return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return int return the edad
     */
    public int getEdad() {
        return edad;
    }

    /**
     * @param edad the edad to set
     */
    public void setEdad(int edad) {
        this.edad = edad;
    }

    /**
     * @return double return the altura
     */
    public double getAltura() {
        return altura;
    }

    /**
     * @param altura the altura to set
     */
    public void setAltura(double altura) {
        this.altura = altura;
    }

    /**
     * @return double return the peso
     */
    public double getPeso() {
        return peso;
    }

    /**
     * @param peso the peso to set
     */
    public void setPeso(double peso) {
        this.peso = peso;
    }

    /**
     * @return String return the colorPelaje
     */
    public String getColorPelaje() {
        return colorPelaje;
    }

    /**
     * @param colorPelaje the colorPelaje to set
     */
    public void setColorPelaje(String colorPelaje) {
        this.colorPelaje = colorPelaje;
    }

    /**
     * @return String return the raza
     */
    public String getRaza() {
        return raza;
    }

    /**
     * @param raza the raza to set
     */
    public void setRaza(String raza) {
        this.raza = raza;
    }

    /**
     * @return char return the genero
     */
    public char getGenero() {
        return genero;
    }

    /**
     * @param genero the genero to set
     */
    public void setGenero(char genero) {
        this.genero = genero;
    }

    /**
     * @return String return the estadoSalud
     */
    public String getEstadoSalud() {
        return estadoSalud;
    }

    /**
     * @param estadoSalud the estadoSalud to set
     */
    public void setEstadoSalud(String estadoSalud) {
        this.estadoSalud = estadoSalud;
    }

    /**
     * @return String return the temperamento
     */
    public String getTemperamento() {
        return temperamento;
    }

    /**
     * @param temperamento the temperamento to set
     */
    public void setTemperamento(String temperamento) {
        this.temperamento = temperamento;
    }

    /**
     * @return int return the nivelEntrenamiento
     */
    public int getNivelEntrenamiento() {
        return nivelEntrenamiento;
    }

    /**
     * @param nivelEntrenamiento the nivelEntrenamiento to set
     */
    public void setNivelEntrenamiento(int nivelEntrenamiento) {
        this.nivelEntrenamiento = nivelEntrenamiento;
    }
    @Override
    public String toString() {
        return "Nombre: " + this.getNombre() +
               "\nEdad: " + this.getEdad() +
               "\nAltura: " + this.getAltura() +
               "\nPeso: " + this.getPeso() +
               "\nColor de pelaje: " + this.getColorPelaje() +
               "\nRaza: " + this.getRaza() +
               "\nGénero: " + this.getGenero() +
               "\nEstado de salud: " + this.getEstadoSalud() +
               "\nTemperamento: " + this.getTemperamento()  +
               "\nNivel de entrenamiento: " + this.getNivelEntrenamiento();
    }

}
