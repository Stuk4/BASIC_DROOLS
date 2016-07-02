package edu.cibertec.drools;

import org.drools.KnowledgeBase;
import org.drools.runtime.StatefulKnowledgeSession;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import edu.cibertec.drools.bean.Account;
import edu.cibertec.drools.bean.Bonus;

/**
 * Created by Java-VS on 02/07/2016.
 */
public class TestBasicRule {


    public static final Logger LOG = LoggerFactory.getLogger(TestBasicRule.class);


    /**
     * main
     * @param args
     */
    public static void main(String[] args) {
        KnowledgeBase knowledgeBase = KnowledgeBaseHelper.createKnowledgeBase("basicRule.drl");

        StatefulKnowledgeSession session = knowledgeBase.newStatefulKnowledgeSession();

        try{
            // agregar lo hechs
        	Account acc1 = new Account(90L, "004");
        	Account acc2 = new Account(20L, "005");
        	Account acc3 = new Account(125L, "005");
        	
        	Bonus bonus = new Bonus(40, "GOAL");
        	Bonus bonus2 = new Bonus(20, "HELP");        	
        	
        	//Para los usuarios que tienes mas de cierto balanca, se le agrega un bono
        	session.insert(acc1);
        	session.insert(acc2);
        	session.insert(acc3);
        	
        	session.insert(bonus); // se agrega un global
        	session.insert(bonus2);
        	
        	session.fireAllRules();
        	
        	System.out.println(acc1.toString());
        	System.out.println(acc2.toString());
        	System.out.println(acc3.toString());
        	
        }
        catch (Exception e){
            LOG.error("Error al ejecutar regla", e);
        }
        finally {
            session.dispose();
            
        }


    }


}
