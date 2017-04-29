package bo.gaceta.rcb.presentacion.autorizado.servicios;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.11-b150120.1832
 * Generated source version: 2.2
 */
@WebService(name = "WebServiceRCBSoap", targetNamespace = "http://www.fundempresa.org.bo:10080/wsrcb")
@XmlSeeAlso({
        ObjectFactory.class
})
public interface WebServiceRCBSoap {


    /**
     * WS retorna datos de inscritos en arrays - compatibilidad con otros lenguajes (Java, etc)
     *
     * @param keyContrato
     * @param idMatricula
     * @param idContrato
     * @return returns bo.gaceta.rcb.presentacion.autorizado.servicios.ArrayOfMatriculaDatos
     */
    @WebMethod(operationName = "SrvMatricula", action = "http://www.fundempresa.org.bo:10080/wsrcb/SrvMatricula")
    @WebResult(name = "SrvMatriculaResult", targetNamespace = "http://www.fundempresa.org.bo:10080/wsrcb")
    @RequestWrapper(localName = "SrvMatricula", targetNamespace = "http://www.fundempresa.org.bo:10080/wsrcb", className = "bo.gaceta.rcb.presentacion.autorizado.servicios.SrvMatricula")
    @ResponseWrapper(localName = "SrvMatriculaResponse", targetNamespace = "http://www.fundempresa.org.bo:10080/wsrcb", className = "bo.gaceta.rcb.presentacion.autorizado.servicios.SrvMatriculaResponse")
    public ArrayOfMatriculaDatos srvMatricula(
            @WebParam(name = "idContrato", targetNamespace = "http://www.fundempresa.org.bo:10080/wsrcb")
                    String idContrato,
            @WebParam(name = "keyContrato", targetNamespace = "http://www.fundempresa.org.bo:10080/wsrcb")
                    String keyContrato,
            @WebParam(name = "IdMatricula", targetNamespace = "http://www.fundempresa.org.bo:10080/wsrcb")
                    String idMatricula);

    /**
     * WS retorna datos de actividades de inscritos en arrays - compatibilidad con otros lenguajes (Java, etc)
     *
     * @param keyContrato
     * @param idMatricula
     * @param idContrato
     * @return returns bo.gaceta.rcb.presentacion.autorizado.servicios.ArrayOfMatriculaActividad
     */
    @WebMethod(operationName = "SrvActividades", action = "http://www.fundempresa.org.bo:10080/wsrcb/SrvActividades")
    @WebResult(name = "SrvActividadesResult", targetNamespace = "http://www.fundempresa.org.bo:10080/wsrcb")
    @RequestWrapper(localName = "SrvActividades", targetNamespace = "http://www.fundempresa.org.bo:10080/wsrcb", className = "bo.gaceta.rcb.presentacion.autorizado.servicios.SrvActividades")
    @ResponseWrapper(localName = "SrvActividadesResponse", targetNamespace = "http://www.fundempresa.org.bo:10080/wsrcb", className = "bo.gaceta.rcb.presentacion.autorizado.servicios.SrvActividadesResponse")
    public ArrayOfMatriculaActividad srvActividades(
            @WebParam(name = "idContrato", targetNamespace = "http://www.fundempresa.org.bo:10080/wsrcb")
                    String idContrato,
            @WebParam(name = "keyContrato", targetNamespace = "http://www.fundempresa.org.bo:10080/wsrcb")
                    String keyContrato,
            @WebParam(name = "IdMatricula", targetNamespace = "http://www.fundempresa.org.bo:10080/wsrcb")
                    String idMatricula);

    /**
     * WS retorna datos de representantes en arrays - compatibilidad con otros lenguajes (Java, etc)
     *
     * @param keyContrato
     * @param idMatricula
     * @param idContrato
     * @return returns bo.gaceta.rcb.presentacion.autorizado.servicios.ArrayOfRepresentantes
     */
    @WebMethod(operationName = "SrvRepresentante", action = "http://www.fundempresa.org.bo:10080/wsrcb/SrvRepresentante")
    @WebResult(name = "SrvRepresentanteResult", targetNamespace = "http://www.fundempresa.org.bo:10080/wsrcb")
    @RequestWrapper(localName = "SrvRepresentante", targetNamespace = "http://www.fundempresa.org.bo:10080/wsrcb", className = "bo.gaceta.rcb.presentacion.autorizado.servicios.SrvRepresentante")
    @ResponseWrapper(localName = "SrvRepresentanteResponse", targetNamespace = "http://www.fundempresa.org.bo:10080/wsrcb", className = "bo.gaceta.rcb.presentacion.autorizado.servicios.SrvRepresentanteResponse")
    public ArrayOfRepresentantes srvRepresentante(
            @WebParam(name = "idContrato", targetNamespace = "http://www.fundempresa.org.bo:10080/wsrcb")
                    String idContrato,
            @WebParam(name = "keyContrato", targetNamespace = "http://www.fundempresa.org.bo:10080/wsrcb")
                    String keyContrato,
            @WebParam(name = "IdMatricula", targetNamespace = "http://www.fundempresa.org.bo:10080/wsrcb")
                    String idMatricula);

    /**
     * WS consulta de imágenes
     *
     * @param keyContrato
     * @param idLibro
     * @param idMatricula
     * @param numReg
     * @param idContrato
     * @return returns bo.gaceta.rcb.presentacion.autorizado.servicios.ArrayOfImagenDatos
     */
    @WebMethod(operationName = "SrvImagen", action = "http://www.fundempresa.org.bo:10080/wsrcb/SrvImagen")
    @WebResult(name = "SrvImagenResult", targetNamespace = "http://www.fundempresa.org.bo:10080/wsrcb")
    @RequestWrapper(localName = "SrvImagen", targetNamespace = "http://www.fundempresa.org.bo:10080/wsrcb", className = "bo.gaceta.rcb.presentacion.autorizado.servicios.SrvImagen")
    @ResponseWrapper(localName = "SrvImagenResponse", targetNamespace = "http://www.fundempresa.org.bo:10080/wsrcb", className = "bo.gaceta.rcb.presentacion.autorizado.servicios.SrvImagenResponse")
    public ArrayOfImagenDatos srvImagen(
            @WebParam(name = "idContrato", targetNamespace = "http://www.fundempresa.org.bo:10080/wsrcb")
                    String idContrato,
            @WebParam(name = "keyContrato", targetNamespace = "http://www.fundempresa.org.bo:10080/wsrcb")
                    String keyContrato,
            @WebParam(name = "IdMatricula", targetNamespace = "http://www.fundempresa.org.bo:10080/wsrcb")
                    String idMatricula,
            @WebParam(name = "idLibro", targetNamespace = "http://www.fundempresa.org.bo:10080/wsrcb")
                    String idLibro,
            @WebParam(name = "numReg", targetNamespace = "http://www.fundempresa.org.bo:10080/wsrcb")
                    String numReg);

    /**
     * WS retorna datos de inscrito con la fecha de la vigencia de la Matricula
     *
     * @param keyContrato
     * @param idMatricula
     * @param idContrato
     * @return returns bo.gaceta.rcb.presentacion.autorizado.servicios.ArrayOfMatriculaDatosVigencia
     */
    @WebMethod(operationName = "SrvMatriculaVigencia", action = "http://www.fundempresa.org.bo:10080/wsrcb/SrvMatriculaVigencia")
    @WebResult(name = "SrvMatriculaVigenciaResult", targetNamespace = "http://www.fundempresa.org.bo:10080/wsrcb")
    @RequestWrapper(localName = "SrvMatriculaVigencia", targetNamespace = "http://www.fundempresa.org.bo:10080/wsrcb", className = "bo.gaceta.rcb.presentacion.autorizado.servicios.SrvMatriculaVigencia")
    @ResponseWrapper(localName = "SrvMatriculaVigenciaResponse", targetNamespace = "http://www.fundempresa.org.bo:10080/wsrcb", className = "bo.gaceta.rcb.presentacion.autorizado.servicios.SrvMatriculaVigenciaResponse")
    public ArrayOfMatriculaDatosVigencia srvMatriculaVigencia(
            @WebParam(name = "idContrato", targetNamespace = "http://www.fundempresa.org.bo:10080/wsrcb")
                    String idContrato,
            @WebParam(name = "keyContrato", targetNamespace = "http://www.fundempresa.org.bo:10080/wsrcb")
                    String keyContrato,
            @WebParam(name = "IdMatricula", targetNamespace = "http://www.fundempresa.org.bo:10080/wsrcb")
                    String idMatricula);

    /**
     * WS retorna datos operativos del inscrito
     *
     * @param keyContrato
     * @param idMatricula
     * @param idContrato
     * @return returns bo.gaceta.rcb.presentacion.autorizado.servicios.ArrayOfMatriculaDatosOperativos
     */
    @WebMethod(operationName = "SrvMatriculaDatosOperativos", action = "http://www.fundempresa.org.bo:10080/wsrcb/SrvMatriculaDatosOperativos")
    @WebResult(name = "SrvMatriculaDatosOperativosResult", targetNamespace = "http://www.fundempresa.org.bo:10080/wsrcb")
    @RequestWrapper(localName = "SrvMatriculaDatosOperativos", targetNamespace = "http://www.fundempresa.org.bo:10080/wsrcb", className = "bo.gaceta.rcb.presentacion.autorizado.servicios.SrvMatriculaDatosOperativos")
    @ResponseWrapper(localName = "SrvMatriculaDatosOperativosResponse", targetNamespace = "http://www.fundempresa.org.bo:10080/wsrcb", className = "bo.gaceta.rcb.presentacion.autorizado.servicios.SrvMatriculaDatosOperativosResponse")
    public ArrayOfMatriculaDatosOperativos srvMatriculaDatosOperativos(
            @WebParam(name = "idContrato", targetNamespace = "http://www.fundempresa.org.bo:10080/wsrcb")
                    String idContrato,
            @WebParam(name = "keyContrato", targetNamespace = "http://www.fundempresa.org.bo:10080/wsrcb")
                    String keyContrato,
            @WebParam(name = "IdMatricula", targetNamespace = "http://www.fundempresa.org.bo:10080/wsrcb")
                    String idMatricula);

}