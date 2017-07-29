/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RedBayesiana;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import javax.swing.JOptionPane;
import org.openmarkov.core.exception.IncompatibleEvidenceException;
import org.openmarkov.core.exception.InvalidStateException;
import org.openmarkov.core.exception.NodeNotFoundException;
import org.openmarkov.core.exception.NotEvaluableNetworkException;
import org.openmarkov.core.exception.ParserException;
import org.openmarkov.core.exception.ProbNodeNotFoundException;
import org.openmarkov.core.exception.UnexpectedInferenceException;
import org.openmarkov.core.inference.InferenceAlgorithm;
import org.openmarkov.core.model.network.EvidenceCase;
import org.openmarkov.core.model.network.ProbNet;
import org.openmarkov.core.model.network.Util;
import org.openmarkov.core.model.network.Variable;
import org.openmarkov.core.model.network.potential.TablePotential;
import org.openmarkov.inference.variableElimination.VariableElimination;
import org.openmarkov.io.probmodel.PGMXReader;

/**
 *
 * @author Katty
 */
public class FutbolRed {

    private String ruta; //archivo pgmx
    private PGMXReader pgmxReader;
    private ProbNet red;
    private EvidenceCase evidencia;
    public String resultado, resultado1, resultado2, resultado3, resultado4;
    private ArrayList<Variable> variableInteres;

    public void setResultado(String resultado) {
        this.resultado = resultado;

    }

    public String getResultado() {
        return resultado;
    }

    public void setResultado1(String resultado1) {
        this.resultado1 = resultado1;

    }

    public String getResultado1() {
        return resultado1;
    }

    public void setResultado2(String resultado2) {
        this.resultado2 = resultado2;

    }

    public String getResultado2() {
        return resultado2;
    }

    public void setResultado3(String resultado2) {
        this.resultado3 = resultado3;

    }

    public String getResultado3() {
        return resultado3;
    }

    public void setResultado4(String resultado2) {
        this.resultado4 = resultado4;

    }

    public String getResultado4() {
        return resultado4;
    }

    public FutbolRed() {
    }

    public FutbolRed(String ruta) {
        variableInteres = new ArrayList<>();
        pgmxReader = new PGMXReader();
        this.ruta = ruta;
    }

    public void pronosticoGanaLocal(String estado, String estacionDelAnio, String arbitro, String clasico, String estadioLleno, String resultadosHistoricosEntreEllos,
            String presupuestoLocal, String numeroJugadoresLocal, String entrenadorTacticaLocal, String rachaLocal, String partidosHistoricosLocal,
            String viaje, String presupuestoVisitante, String numeroJugadoresVisitantes, String entrenadorTacticaVisitante, String rachaVisitante, String partidosHistoricosVisitante)
            throws FileNotFoundException, ParserException, NotEvaluableNetworkException, NodeNotFoundException, IncompatibleEvidenceException, UnexpectedInferenceException, InvalidStateException, ProbNodeNotFoundException {

        InputStream file = new FileInputStream(new File(ruta));
        red = pgmxReader.loadProbNet(file, "redBayesianaFutbol").getProbNet();

        //evidencias son la entradas
        evidencia = new EvidenceCase();

        // algoritmo de inferencia
        InferenceAlgorithm variableEliminacion = new VariableElimination(red);
        variableEliminacion.setPreResolutionEvidence(evidencia);

        //obtener variable de interes
        variableInteres.add(red.getVariable("pronostico"));
        variableInteres.add(red.getVariable("motivacionLocal"));
        variableInteres.add(red.getVariable("motivacionVisitante"));
        variableInteres.add(red.getVariable("jugadaLocal"));
        variableInteres.add(red.getVariable("jugadaVisitante"));
        //variableInteres.add(red.getVariable(""));
        //variableInteres.add(red.getVariable("pronostico"));

        //armar un tablas hash
        HashMap<Variable, TablePotential> posteriroriProb = variableEliminacion.getProbsAndUtilities();

        //cargar evidencias
        //---------- datos Partido
        evidencia.addFinding(red, "estacionDelAnio", estacionDelAnio);
        evidencia.addFinding(red, "clasico", clasico);
        evidencia.addFinding(red, "estadioLleno", estadioLleno);
        evidencia.addFinding(red, "arbitro", arbitro);
        evidencia.addFinding(red, "resultadosHistoricosEntreEllos", resultadosHistoricosEntreEllos);

        //-------- datos local        
        evidencia.addFinding(red, "presupuestoLocal", presupuestoLocal);
        evidencia.addFinding(red, "numeroJugadoresLocal", numeroJugadoresLocal);
        evidencia.addFinding(red, "entrenadorTacticaLocal", entrenadorTacticaLocal);
        evidencia.addFinding(red, "rachaLocal", rachaLocal);
        evidencia.addFinding(red, "partidosHistoricosLocal", partidosHistoricosLocal);

        //---------datos visitante
        evidencia.addFinding(red, "viaje", viaje);
        evidencia.addFinding(red, "presupuestoVisitante", presupuestoVisitante);
        evidencia.addFinding(red, "numeroJugadoresVisitantes", numeroJugadoresVisitantes);
        evidencia.addFinding(red, "entrenadorTacticaVisitante", entrenadorTacticaVisitante);
        evidencia.addFinding(red, "rachaVisitante", rachaVisitante);
        evidencia.addFinding(red, "partidosHistoricosVisitante", partidosHistoricosVisitante);

        posteriroriProb = variableEliminacion.getProbsAndUtilities(variableInteres);
        //imprimir
        mostrarValoresGanaLocal(posteriroriProb, estado);

    }

    public void mostrarValoresGanaLocal(HashMap<Variable, TablePotential> posteriroriProb, String estado) throws InvalidStateException {

        for (Variable variableIntere : variableInteres) {
            TablePotential tp = posteriroriProb.get(variableIntere);

            if (variableIntere.toString().equals("pronostico")) {
                int indice = variableIntere.getStateIndex(estado);
                double valor = tp.values[indice];
                resultado = String.valueOf(Util.roundedString(valor, "0.001"));

            } //____________________________________________________________________________________________
            else if (variableIntere.toString().equals("motivacionLocal")) {
                if (estado.equals("ganaVisitante")) {
                    int indice = variableIntere.getStateIndex("no");
                    double valor = tp.values[indice];
                    System.out.println(variableIntere.getStateName(indice));
                    resultado1 = String.valueOf(Util.roundedString(valor, "0.001")) + "\t\t" + variableIntere.getStateName(indice);
                } else {
                    int indice = variableIntere.getStateIndex("si");
                    double valor = tp.values[indice];
                    System.out.println(variableIntere.getStateName(indice));
                    resultado1 = String.valueOf(Util.roundedString(valor, "0.001")) +"\t\t"+ variableIntere.getStateName(indice);
                }
                //______________________________________________________________________  

            } else if (variableIntere.toString().equals("motivacionVisitante")) {
                if (estado.equals("ganaLocal")) {
                    int indice = variableIntere.getStateIndex("no");
                    System.out.println(variableIntere.getStateName(indice));
                    double valor = tp.values[indice];
                    resultado2 = String.valueOf(Util.roundedString(valor, "0.001"))+"\t\t"+ variableIntere.getStateName(indice);
                } else {
                    int indice = variableIntere.getStateIndex("si");
                    System.out.println(variableIntere.getStateName(indice));
                    double valor = tp.values[indice];
                    resultado2 = String.valueOf(Util.roundedString(valor, "0.001"))+"\t\t"+ variableIntere.getStateName(indice);
                }
                //_______________________________________________________________________

            } else if (variableIntere.toString().equals("jugadaLocal")) {

                if (estado.equals("ganaVisitante")) {
                    int indice = variableIntere.getStateIndex("no");
                    double valor = tp.values[indice];
                    resultado3 = String.valueOf(Util.roundedString(valor, "0.001"))+"\t\t"+ variableIntere.getStateName(indice);
                } else {
                    int indice = variableIntere.getStateIndex("si");
                    double valor = tp.values[indice];
                    resultado3 = String.valueOf(Util.roundedString(valor, "0.001"))+"\t\t"+ variableIntere.getStateName(indice);
                }
                //_________________________________________________________________________

            } else if (variableIntere.toString().equals("jugadaVisitante")) {
                if (estado.equals("ganaLocal")) {
                    int indice = variableIntere.getStateIndex("no");
                    double valor = tp.values[indice];
                    resultado4 = String.valueOf(Util.roundedString(valor, "0.001"))+"\t\t"+ variableIntere.getStateName(indice);
                } else {
                    int indice = variableIntere.getStateIndex("si");
                    double valor = tp.values[indice];
                    resultado4 = String.valueOf(Util.roundedString(valor, "0.001"))+"\t\t"+ variableIntere.getStateName(indice);
                }
            }
            //____________________________________________________________________________________
        }

    }

}
