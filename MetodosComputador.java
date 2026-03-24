package com.mycompany.proyectocomputador;

import java.io.*;
import java.util.Collections;
import java.util.Comparator;
import java.util.Vector;

public class MetodosComputador {

    // ====== VALIDAR CODIGO DUPLICADO ======
    public boolean existeCodigo(Vector<computador> vector, String codigo) {
        for (computador c : vector) {
            if (c.getCodigo().equalsIgnoreCase(codigo)) {
                return true;
            }
        }
        return false;
    }

    // ====== ADICIONAR ======
    public void adicionarComputador(Vector<computador> vector, computador c) {
        vector.add(c);
    }

    // ====== BUSCAR ======
    public int buscarComputador(Vector<computador> vector, String atributo, String valor) {
        for (int i = 0; i < vector.size(); i++) {
            computador c = vector.get(i);

            switch (atributo) {
                case "codigo":
                    if (c.getCodigo().equalsIgnoreCase(valor)) return i;
                    break;
                case "marca":
                    if (c.getMarca().equalsIgnoreCase(valor)) return i;
                    break;
                case "procesador":
                    if (c.getProcesador().equalsIgnoreCase(valor)) return i;
                    break;
                case "ram":
                    if (String.valueOf(c.getRam()).equals(valor)) return i;
                    break;
            }
        }
        return -1;
    }

    // ====== ACTUALIZAR ======
    public void actualizarComputador(Vector<computador> vector, int pos, String atributoBuscado,
                                     String codigo, String marca, String procesador, int ram) {

        computador c = vector.get(pos);

        if (!atributoBuscado.equals("codigo")) {
            c.setCodigo(codigo);
        }
        if (!atributoBuscado.equals("marca")) {
            c.setMarca(marca);
        }
        if (!atributoBuscado.equals("procesador")) {
            c.setProcesador(procesador);
        }
        if (!atributoBuscado.equals("ram")) {
            c.setRam(ram);
        }
    }

    // ====== ELIMINAR ======
    public void eliminarComputador(Vector<computador> vector, int pos) {
        vector.remove(pos);
    }

    // ====== ORDENAR ASC ======
    public void ordenarAsc(Vector<computador> vector, String atributo) {
        Collections.sort(vector, obtenerComparador(atributo, true));
    }

    // ====== ORDENAR DESC ======
    public void ordenarDesc(Vector<computador> vector, String atributo) {
        Collections.sort(vector, obtenerComparador(atributo, false));
    }

    // ====== COMPARADOR ======
    private Comparator<computador> obtenerComparador(String atributo, boolean ascendente) {
        Comparator<computador> comparador = null;

        switch (atributo) {
            case "codigo":
                comparador = Comparator.comparing(computador::getCodigo, String.CASE_INSENSITIVE_ORDER);
                break;
            case "marca":
                comparador = Comparator.comparing(computador::getMarca, String.CASE_INSENSITIVE_ORDER);
                break;
            case "procesador":
                comparador = Comparator.comparing(computador::getProcesador, String.CASE_INSENSITIVE_ORDER);
                break;
            case "ram":
                comparador = Comparator.comparingInt(computador::getRam);
                break;
        }

        if (!ascendente && comparador != null) {
            comparador = comparador.reversed();
        }

        return comparador;
    }

    // ====== COPIAR ======
    public Vector<computador> copiarComputadores(Vector<computador> vectorOriginal) {
        Vector<computador> copia = new Vector<>();

        for (computador c : vectorOriginal) {
            copia.add(new computador(c.getCodigo(), c.getMarca(), c.getProcesador(), c.getRam()));
        }

        return copia;
    }

    // ====== EXPORTAR ======
    public void exportarArchivo(Vector<computador> vector, String nombreArchivo) throws IOException {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(nombreArchivo))) {
            for (computador c : vector) {
                bw.write(c.getCodigo() + "|" + c.getMarca() + "|" + c.getProcesador() + "|" + c.getRam());
                bw.newLine();
            }
        }
    }

    // ====== IMPORTAR SIN DUPLICADOS ======
    public Vector<computador> importarArchivo(String nombreArchivo) throws IOException {
        Vector<computador> vector = new Vector<>();

        try (BufferedReader br = new BufferedReader(new FileReader(nombreArchivo))) {
            String linea;

            while ((linea = br.readLine()) != null) {
                String[] datos = linea.split("\\|");

                if (datos.length == 4) {
                    String codigo = datos[0];
                    String marca = datos[1];
                    String procesador = datos[2];
                    int ram = Integer.parseInt(datos[3]);

                    // VALIDAR QUE NO SE REPITA
                    if (!existeCodigo(vector, codigo)) {
                        vector.add(new computador(codigo, marca, procesador, ram));
                    }
                }
            }
        }

        return vector;
    }
}
