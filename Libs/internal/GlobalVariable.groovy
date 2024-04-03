package internal

import com.kms.katalon.core.configuration.RunConfiguration
import com.kms.katalon.core.main.TestCaseMain


/**
 * This class is generated automatically by Katalon Studio and should not be modified or deleted.
 */
public class GlobalVariable {
     
    /**
     * <p>Profile default : Url Agendamiento ADM</p>
     */
    public static Object Url
     
    /**
     * <p>Profile default : Usuario para inicio de sesi&oacute;n</p>
     */
    public static Object Usuario
     
    /**
     * <p>Profile default : Contrase&ntilde;a para inicio de sesi&oacute;n</p>
     */
    public static Object Clave
     
    /**
     * <p>Profile default : C&oacute;digo de Pa&iacute;s Colombia</p>
     */
    public static Object CodPais
     
    /**
     * <p>Profile default : Para Crear Pa&iacute;s Colombia</p>
     */
    public static Object NombrePais
     
    /**
     * <p>Profile default : Texto de prueba caracteres distintos</p>
     */
    public static Object TextoPrueba
     
    /**
     * <p>Profile default : Campo para hacer pruebas</p>
     */
    public static Object CampoPrueba
     
    /**
     * <p>Profile default : Identificacion para cliente</p>
     */
    public static Object ClienteIdentificacion
     
    /**
     * <p>Profile default : Nombre para Cliente</p>
     */
    public static Object ClienteNombre
     
    /**
     * <p>Profile default : Apellido para cliente</p>
     */
    public static Object ClienteApellido
     
    /**
     * <p>Profile default : Fecha Nacimiento cliente dd&#47;mm&#47;aaaa </p>
     */
    public static Object ClienteFechaNac
     
    /**
     * <p>Profile default : Direccion Cliente</p>
     */
    public static Object ClienteDireccion
     
    /**
     * <p>Profile default : Cliente Telefono Fijo</p>
     */
    public static Object ClienteTelefono
     
    /**
     * <p>Profile default : email cliente</p>
     */
    public static Object ClienteEmail
     
    /**
     * <p>Profile default : Cliente numero de celular</p>
     */
    public static Object ClienteCelular
     
    /**
     * <p></p>
     */
    public static Object UploadFile
     

    static {
        try {
            def selectedVariables = TestCaseMain.getGlobalVariables("default")
			selectedVariables += TestCaseMain.getGlobalVariables(RunConfiguration.getExecutionProfile())
            selectedVariables += TestCaseMain.getParsedValues(RunConfiguration.getOverridingParameters(), selectedVariables)
    
            Url = selectedVariables['Url']
            Usuario = selectedVariables['Usuario']
            Clave = selectedVariables['Clave']
            CodPais = selectedVariables['CodPais']
            NombrePais = selectedVariables['NombrePais']
            TextoPrueba = selectedVariables['TextoPrueba']
            CampoPrueba = selectedVariables['CampoPrueba']
            ClienteIdentificacion = selectedVariables['ClienteIdentificacion']
            ClienteNombre = selectedVariables['ClienteNombre']
            ClienteApellido = selectedVariables['ClienteApellido']
            ClienteFechaNac = selectedVariables['ClienteFechaNac']
            ClienteDireccion = selectedVariables['ClienteDireccion']
            ClienteTelefono = selectedVariables['ClienteTelefono']
            ClienteEmail = selectedVariables['ClienteEmail']
            ClienteCelular = selectedVariables['ClienteCelular']
            UploadFile = selectedVariables['UploadFile']
            
        } catch (Exception e) {
            TestCaseMain.logGlobalVariableError(e)
        }
    }
}
