package edu.escuelaing.arep.app;

import static spark.Spark.*;

import java.util.stream.Stream;

import edu.escuelaing.arep.app.model.Json;
import edu.escuelaing.arep.app.servicios.JsonTransformer;
//import edu.escuelaing.arep.app.servicios.Services;
//import edu.escuelaing.arep.calculos.Estadistica;
//import edu.escuelaing.arep.model.LinkedList;
import spark.Request;
import spark.Response;

/**
 *
 * @author cristian.lopez-a
 */
public class SparkWebApp {
    public static void main(String[] args) {
        port(getPort());
        get("/", (req, res) -> inputDataPage(req, res));
        get("/results", (req, res) -> resultsPage(req, res));
    }

    /**
     * @param req tipo Request
     * @param res tipo Response
     * @return pageContent contenido html de la pagina
     */
    public static String inputDataPage(Request req, Response res) {
        String pageContent = "<!DOCTYPE html>" + "<html>" + "<body>" + "<h1>Parcial </h1>"
                + "<p>Ingresar los numeros separados por coma ',' Ej: 1,2,3</p>" + "<form action=\"/results\">"
                + "  Datos a ingresar:<br>" + "  <input type=\"text\" name=\"datos\" placeholder=\"1,2,3\">" + "  <br>"
                + "  <input type=\"submit\" value=\"Calcular\">" + "</form>" + "</body>" + "</html>";
        return pageContent;
    }

    /**
     * @param req tipo Request
     * @param res tipo Response
     * @return pageContent contenido html de la pagina
     */
    public static String resultsPage(Request req, Response res) {
        String datos = req.queryParams("datos");
        String[] datoS = datos.split(",");
        int[] datosI = Stream.of(datoS).mapToInt(Integer::parseInt).toArray();
        Json ress = new Json(datosI);
        ress.mergeSort2();
        JsonTransformer json = new JsonTransformer();

        return json.render(ress);
    }

    /**
     * @return port retorne al puerto a la cual la aplicacion sale
     */
    static int getPort() {
        if (System.getenv("PORT") != null) {
            return Integer.parseInt(System.getenv("PORT"));
        }
        return 4568; // returns default port if heroku-port isn't set(i.e. on localhost)
    }
}