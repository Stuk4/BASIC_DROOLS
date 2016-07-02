package edu.cibertec.drools;

import org.drools.KnowledgeBase;
import org.drools.KnowledgeBaseFactory;
import org.drools.builder.KnowledgeBuilder;
import org.drools.builder.KnowledgeBuilderFactory;
import org.drools.builder.ResourceType;
import org.drools.io.ResourceFactory;

/**
 * Created by Java-VS on 02/07/2016.
 */
public class KnowledgeBaseHelper {


    public static KnowledgeBase createKnowledgeBase(String ruleFile){
        KnowledgeBuilder builder = KnowledgeBuilderFactory.newKnowledgeBuilder();

        builder.add(
                ResourceFactory.newClassPathResource(ruleFile)
                , ResourceType.DRL
        );
        if(builder.hasErrors()){
            throw new RuntimeException(builder.getErrors().toString());
        }

        KnowledgeBase knowledgeBase = KnowledgeBaseFactory.newKnowledgeBase();
        knowledgeBase.addKnowledgePackages(builder.getKnowledgePackages());

        return knowledgeBase;


    }


}
