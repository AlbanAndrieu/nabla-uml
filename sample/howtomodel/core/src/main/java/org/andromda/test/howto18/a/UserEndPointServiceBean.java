// license-header java merge-point
//
// Generated by: SessionBeanImpl.vsl in andromda-ejb3-cartridge.
//
package org.andromda.test.howto18.a;

import javax.jws.WebService;

/**
 * @see UserEndPointServiceBase
 * Remember to manually configure the local business interface this bean implements if originally you only
 * defined the remote business interface. However, this change is automatically reflected in the ejb-jar.xml.
 * Do not specify the javax.ejb.Stateless annotation
 * Instead, the session bean is defined in the ejb-jar.xml descriptor.
 */
@WebService(endpointInterface = "org.andromda.test.howto18.a.UserEndPointServiceWSInterface", serviceName = "UserEndPointService")
public class UserEndPointServiceBean extends UserEndPointServiceBase implements UserEndPointServiceRemote
{

    // --------------- Constructors ---------------

    /**
     * Default constructor extending base class default constructor
     */
    public UserEndPointServiceBean()
    {
        super();
    }

    // -------- Business Methods Impl --------------

    /**
     * @see UserEndPointServiceBase#addUser(String)
     */
    protected void handleAddUser(String name) throws Exception
    {
        // TODO: put your implementation here.
        throw new UnsupportedOperationException("org.andromda.test.howto18.a.UserEndPointServiceBean.handleAddUser(String name) Not implemented!");
    }

    /**
     * @see UserEndPointServiceBase#getUser(Long)
     */
    protected User handleGetUser(Long id) throws Exception
    {
        // TODO: put your implementation here.
        // Dummy return value, just that the file compiles
        return null;
    }

    // -------- Lifecycle Callback Implementation --------------

}