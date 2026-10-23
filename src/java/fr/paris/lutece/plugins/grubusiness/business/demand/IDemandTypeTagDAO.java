package fr.paris.lutece.plugins.grubusiness.business.demand;

import java.util.List;
import java.util.Optional;

public interface IDemandTypeTagDAO {
    /**
     * Insert a new record in the table.
     *
     * @param demandTypeTag
     *            instance of the DemandTypeTag object to insert
     */
    void insert( DemandTypeTag demandTypeTag);

    /**
     * Update the record in the table
     *
     * @param demandTypeTag
     *            the reference of the DemandTypeTag
     */
    void store( DemandTypeTag demandTypeTag);

    /**
     *
     * Delete a record from the table
     *
     * @param nKey
     *            The identifier of the DemandTypeTag to delete
     */
    void delete( int nKey );

    ///////////////////////////////////////////////////////////////////////////
    // Finders

    /**
     * Load the data from the table
     *
     * @param nKey
     *            The identifier of the demandTypeTag
     * @return The instance of the demandTypeTag
     */
    Optional<DemandTypeTag> load(int nKey );

    /**
     * Load the data from the table by its unique code
     *
     * @param strCode
     *            The code of the demandTypeTag
     * @return The instance of the demandTypeTag or an empty Optional
     */
    Optional<DemandTypeTag> selectByCode(String strCode );

    /**
     * Load the data of all the demandTypeTag objects and returns them as a list
     *
     * @return The list which contains the data of all the demandTypeTag objects
     */
    List<DemandTypeTag> selectDemandTypeTagsList( );

    /**
     * Load the id of all the demandTypeTag objects and returns them as a list
     *
     * @return The list which contains the id of all the demandTypeTag objects
     */
    List<Integer> selectIdDemandTypeTagsList( );

    /**
     * Load the data of the demandTypeTag objects from a list of ids and returns them as a list
     *
     * @param listIds
     *            list of ids
     * @return The list which contains the data of the demandTypeTag objects
     */
    List<DemandTypeTag> selectDemandTypeTagsListByIds(List<Integer> listIds );
}
