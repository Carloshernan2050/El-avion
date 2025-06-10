package uniandes.cupi2.avion.interfaz;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.*;

/**
 * Panel de botones de interacción con el programa del avión.
 */
@SuppressWarnings("serial")
public class PanelBotonesAvion extends JPanel implements ActionListener
{
    // -----------------------------------------------------------------
    // Constantes
    // -----------------------------------------------------------------

    public final static String REGISTRAR = "REGISTRAR_PASAJERO";
    public final static String ANULAR = "ANULAR_PASAJERO";
    public final static String BUSCAR = "BUSCAR_PASAJERO";
    public final static String PORCENTAJE = "PORCENTAJE_OCUPACION";
    private final static String OPCION_1 = "OPCION_1";
    private final static String OPCION_2 = "OPCION_2"; // Usaremos esta para mostrar silla en ventana

    // -----------------------------------------------------------------
    // Atributos de interfaz
    // -----------------------------------------------------------------

    private JButton bRegistro;
    private JButton bAnular;
    private JButton bBuscarPasajero;
    private JButton bPorcOcupacion;
    private JButton botonOpcion1;
    private JButton botonOpcion2;

    private InterfazAvion ventana;

    // -----------------------------------------------------------------
    // Constructores
    // -----------------------------------------------------------------

    public PanelBotonesAvion( InterfazAvion pVentana )
    {
        ventana = pVentana;

        setLayout( new GridLayout( 2, 3, 8, 2 ) );
        setBorder( new EmptyBorder( 5, 5, 5, 5 ) );

        bRegistro = new JButton( "Registrar Pasajero" );
        bRegistro.setActionCommand( REGISTRAR );
        bRegistro.addActionListener( this );
        add( bRegistro );

        bAnular = new JButton( "Eliminar Pasajero" );
        bAnular.setActionCommand( ANULAR );
        bAnular.addActionListener( this );
        add( bAnular );

        bBuscarPasajero = new JButton( "Buscar Pasajero" );
        bBuscarPasajero.setActionCommand( BUSCAR );
        bBuscarPasajero.addActionListener( this );
        add( bBuscarPasajero );

        bPorcOcupacion = new JButton( "Porcentaje Ocupación" );
        bPorcOcupacion.setActionCommand( PORCENTAJE );
        bPorcOcupacion.addActionListener( this );
        add( bPorcOcupacion );

        botonOpcion1 = new JButton( "Opción 1" );
        botonOpcion1.setActionCommand( OPCION_1 );
        botonOpcion1.addActionListener( this );
        add( botonOpcion1 );

        botonOpcion2 = new JButton( "Opción 2" );
        botonOpcion2.setActionCommand( OPCION_2 );
        botonOpcion2.addActionListener( this );
        add( botonOpcion2 );
    }

    // -----------------------------------------------------------------
    // Métodos
    // -----------------------------------------------------------------

    public void actionPerformed( ActionEvent pEvento )
    {
        String comando = pEvento.getActionCommand();

        if( comando.equals( REGISTRAR ) )
        {
            ventana.registrarPasajero();
        }
        else if( comando.equals( ANULAR ) )
        {
            ventana.eliminarPasajero();
        }
        else if( comando.equals( BUSCAR ) )
        {
            ventana.buscarPasajero();
        }
        else if( comando.equals( PORCENTAJE ) )
        {
            ventana.mostrarPorcentajeOcupacion();
        }
        else if( comando.equals( OPCION_1 ) )
        {
            ventana.reqFuncOpcion1();
        }
        else if( comando.equals( OPCION_2 ) )
        {
            ventana.reqMostrarSillaEnVentana(); // Aquí se usa la función para mostrar silla en ventana
        }
    }
}
