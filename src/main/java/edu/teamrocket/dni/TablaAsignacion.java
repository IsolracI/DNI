package edu.teamrocket.dni;

import java.util.Arrays;

public class TablaAsignacion {
    private final char[] tabla = {'T', 'R', 'W', 'A', 'G', 'M',
                                  'Y', 'F', 'P', 'D', 'X', 'B',
                                  'N', 'J', 'Z', 'S', 'Q', 'V',
                                  'H', 'L', 'C', 'K', 'E'};

    public char[] getTabla() {
        return this.tabla;
    }

    public char getLetra(int index) {
        try {
            return getTabla()[index];
        }
        catch (ArrayIndexOutOfBoundsException e) {
            throw new ArrayIndexOutOfBoundsException(index);
        }
    }

    public int getModulo() {
        return getTabla().length;
    }

    public boolean isLetraPermitida(char letra) {
        return Arrays.asList(getTabla()).contains(letra);
    }
}
