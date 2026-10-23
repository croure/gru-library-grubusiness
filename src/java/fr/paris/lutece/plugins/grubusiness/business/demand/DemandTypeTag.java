package fr.paris.lutece.plugins.grubusiness.business.demand;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;

public class DemandTypeTag implements Serializable {
    private static final long serialVersionUID = 1L;

    // Variables declarations
    @JsonProperty( "id" )
    private int _nId;

    @JsonProperty( "name" )
    private String _strName;

    @JsonProperty( "code" )
    private String _strCode;

    /**
     * Returns the Id
     *
     * @return The Id
     */
    public int getId( )
    {
        return _nId;
    }

    /**
     * Sets the Id
     *
     * @param nId
     *            The Id
     */
    public void setId( int nId )
    {
        _nId = nId;
    }

    /**
     * Returns the Name
     *
     * @return The Name
     */
    public String getName( )
    {
        return _strName;
    }

    /**
     * Sets the Name
     *
     * @param strName
     *            The Name
     */
    public void setName( String strName )
    {
        _strName = strName;
    }

    /**
     * Returns the Code
     *
     * @return The Code
     */
    public String getCode( )
    {
        return _strCode;
    }

    /**
     * Sets the Code
     *
     * @param strCode
     *            The Code
     */
    public void setCode( String strCode )
    {
        _strCode = strCode;
    }
}
