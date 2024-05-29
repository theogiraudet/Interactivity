package org.eclipse.sirius.components.interactivity.starter;

import graphql.TypeResolutionEnvironment;
import graphql.schema.GraphQLObjectType;
import graphql.schema.GraphQLSchema;
import graphql.schema.TypeResolver;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

/**
 * The reflective type resolver will look for the GraphQL object type with the name of the class of the given object.
 * If the object is an EMF Object, return the name of its interface.
 *
 * @author tgiraudet
 */
public class ReflectiveEmfTypeResolver implements TypeResolver {

    @Override
    public GraphQLObjectType getType(TypeResolutionEnvironment environment) {
        GraphQLSchema graphQLSchema = environment.getSchema();
        Object object = environment.getObject();
        if(object instanceof EObject eobject) {
            return graphQLSchema.getObjectType(eobject.eClass().getName());
        }
        return graphQLSchema.getObjectType(object.getClass().getSimpleName());
    }

}