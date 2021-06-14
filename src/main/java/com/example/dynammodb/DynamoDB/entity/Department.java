package com.example.dynammodb.DynamoDB.entity;

import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBAttribute;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBDocument;

@DynamoDBDocument
public class Department {

    @DynamoDBAttribute
    private String departmentName;

    @DynamoDBAttribute
    private String departmentCode;

    public Department() {
    }

    public Department(String departmentName, String departmentCode) {
        this.departmentName = departmentName;
        this.departmentCode = departmentCode;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public String getDepartmentCode() {
        return departmentCode;
    }
}
