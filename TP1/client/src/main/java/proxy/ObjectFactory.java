
package proxy;

import javax.xml.namespace.QName;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlElementDecl;
import jakarta.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the proxy package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _ConversionEuroTODh_QNAME = new QName("http://ws/", "ConversionEuroTODh");
    private final static QName _ConversionEuroTODhResponse_QNAME = new QName("http://ws/", "ConversionEuroTODhResponse");
    private final static QName _Compt_QNAME = new QName("http://ws/", "compt");
    private final static QName _GetCompte_QNAME = new QName("http://ws/", "getCompte");
    private final static QName _GetCompteResponse_QNAME = new QName("http://ws/", "getCompteResponse");
    private final static QName _GetComptes_QNAME = new QName("http://ws/", "getComptes");
    private final static QName _GetComptesResponse_QNAME = new QName("http://ws/", "getComptesResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: proxy
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ConversionEuroTODh }
     * 
     * @return
     *     the new instance of {@link ConversionEuroTODh }
     */
    public ConversionEuroTODh createConversionEuroTODh() {
        return new ConversionEuroTODh();
    }

    /**
     * Create an instance of {@link ConversionEuroTODhResponse }
     * 
     * @return
     *     the new instance of {@link ConversionEuroTODhResponse }
     */
    public ConversionEuroTODhResponse createConversionEuroTODhResponse() {
        return new ConversionEuroTODhResponse();
    }

    /**
     * Create an instance of {@link Compte }
     * 
     * @return
     *     the new instance of {@link Compte }
     */
    public Compte createCompte() {
        return new Compte();
    }

    /**
     * Create an instance of {@link GetCompte }
     * 
     * @return
     *     the new instance of {@link GetCompte }
     */
    public GetCompte createGetCompte() {
        return new GetCompte();
    }

    /**
     * Create an instance of {@link GetCompteResponse }
     * 
     * @return
     *     the new instance of {@link GetCompteResponse }
     */
    public GetCompteResponse createGetCompteResponse() {
        return new GetCompteResponse();
    }

    /**
     * Create an instance of {@link GetComptes }
     * 
     * @return
     *     the new instance of {@link GetComptes }
     */
    public GetComptes createGetComptes() {
        return new GetComptes();
    }

    /**
     * Create an instance of {@link GetComptesResponse }
     * 
     * @return
     *     the new instance of {@link GetComptesResponse }
     */
    public GetComptesResponse createGetComptesResponse() {
        return new GetComptesResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConversionEuroTODh }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ConversionEuroTODh }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws/", name = "ConversionEuroTODh")
    public JAXBElement<ConversionEuroTODh> createConversionEuroTODh(ConversionEuroTODh value) {
        return new JAXBElement<>(_ConversionEuroTODh_QNAME, ConversionEuroTODh.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConversionEuroTODhResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ConversionEuroTODhResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws/", name = "ConversionEuroTODhResponse")
    public JAXBElement<ConversionEuroTODhResponse> createConversionEuroTODhResponse(ConversionEuroTODhResponse value) {
        return new JAXBElement<>(_ConversionEuroTODhResponse_QNAME, ConversionEuroTODhResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Compte }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Compte }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws/", name = "compt")
    public JAXBElement<Compte> createCompt(Compte value) {
        return new JAXBElement<>(_Compt_QNAME, Compte.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetCompte }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetCompte }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws/", name = "getCompte")
    public JAXBElement<GetCompte> createGetCompte(GetCompte value) {
        return new JAXBElement<>(_GetCompte_QNAME, GetCompte.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetCompteResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetCompteResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws/", name = "getCompteResponse")
    public JAXBElement<GetCompteResponse> createGetCompteResponse(GetCompteResponse value) {
        return new JAXBElement<>(_GetCompteResponse_QNAME, GetCompteResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetComptes }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetComptes }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws/", name = "getComptes")
    public JAXBElement<GetComptes> createGetComptes(GetComptes value) {
        return new JAXBElement<>(_GetComptes_QNAME, GetComptes.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetComptesResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetComptesResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws/", name = "getComptesResponse")
    public JAXBElement<GetComptesResponse> createGetComptesResponse(GetComptesResponse value) {
        return new JAXBElement<>(_GetComptesResponse_QNAME, GetComptesResponse.class, null, value);
    }

}
