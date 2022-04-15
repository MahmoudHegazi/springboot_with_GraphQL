package com.example.myquery.exception;

import graphql.ErrorType;
import graphql.GraphQL;
import graphql.GraphQLError;
import graphql.language.SourceLocation;
import org.springframework.web.servlet.mvc.method.annotation.ExceptionHandlerExceptionResolver;

import java.util.HashMap;
import java.util.List;

public class DogNotFoundException extends RuntimeException implements GraphQLError {

    // this instead of remove default message we can add extensions to the default
    private final HashMap<String, Object> extensions = new HashMap<>();

    public DogNotFoundException(String message, Long id){
        super(message);
    }

    /**
     * @return the location(s) within the GraphQL document at which the error occurred. Each {@link SourceLocation}
     * describes the beginning of an associated syntax element
     */
    @Override
    public List<SourceLocation> getLocations() {
        return null;
    }

    @Override
    public HashMap<String, Object> getExtensions(){
        return extensions;
    }
    /**
     * @return an enum classifying this error
     */
    @Override
    public ErrorType getErrorType() {
        return null;
    }
}
