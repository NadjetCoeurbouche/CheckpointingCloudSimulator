


import static com.nadjetkerbouche.checkpointingsimu.Final_List.finalVmsList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.SwingUtilities;
import javax.swing.table.DefaultTableModel;


/**
 *
 * @author Nadjet KERBOUCHE
 */
public class Multithreading extends Thread {
   /* 

    private final DefaultTableModel model;
     Final_List object = new Final_List();
monitoringTasks m;
 float  interval;
    public Multithreading(DefaultTableModel model) {
        super();
        this.model = model;
    }
    @Override
    public void run() {
        
                int index = 0;
try {
            m = new monitoringTasks();
        } catch (InterruptedException ex) {
            Logger.getLogger(Multithreading.class.getName()).log(Level.SEVERE, null, ex);
        }
            index = 0;
              interval = finalVmsList.get(index).interval;


            SwingUtilities.invokeLater(new Runnable() {

                @Override
                public void run() { 

 try {                                           
     model.setValueAt(m.fill_interval(interval), 0, 2);

                    } catch (InterruptedException ex) {
                        Logger.getLogger(Multithreading.class.getName()).log(Level.SEVERE, null, ex);
                    }

                                               interval = interval + interval ;

        

                }
            });
     
}
*/
       }

 
