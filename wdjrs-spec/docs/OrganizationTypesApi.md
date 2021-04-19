# OrganizationTypesApi

All URIs are relative to *https://&lt;tenant hostname&gt;/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**organizationTypesGet**](OrganizationTypesApi.md#organizationTypesGet) | **GET** /organizationTypes | 
[**organizationTypesIDGet**](OrganizationTypesApi.md#organizationTypesIDGet) | **GET** /organizationTypes/{ID} | 



## organizationTypesGet

> InlineResponse20014 organizationTypesGet(limit, offset)



Secured by: Set Up: Organization

### Example

```java
// Import classes:
import com.workday.common.ApiClient;
import com.workday.common.ApiException;
import com.workday.common.Configuration;
import com.workday.common.models.*;
import com.workday.common.api.OrganizationTypesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://<tenant hostname>/api/v1");

        OrganizationTypesApi apiInstance = new OrganizationTypesApi(defaultClient);
        Long limit = 56L; // Long | The number of instances to retrieve
        Long offset = 56L; // Long | The offset in the collection
        try {
            InlineResponse20014 result = apiInstance.organizationTypesGet(limit, offset);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling OrganizationTypesApi#organizationTypesGet");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **limit** | **Long**| The number of instances to retrieve | [optional]
 **offset** | **Long**| The offset in the collection | [optional]

### Return type

[**InlineResponse20014**](InlineResponse20014.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | getting response |  -  |
| **200** | an error occurred |  -  |


## organizationTypesIDGet

> OrganizationTypeSummaryE91ac1399cd410000481d84f988f0ec7 organizationTypesIDGet(ID)



Secured by: Set Up: Organization

### Example

```java
// Import classes:
import com.workday.common.ApiClient;
import com.workday.common.ApiException;
import com.workday.common.Configuration;
import com.workday.common.models.*;
import com.workday.common.api.OrganizationTypesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://<tenant hostname>/api/v1");

        OrganizationTypesApi apiInstance = new OrganizationTypesApi(defaultClient);
        String ID = "ID_example"; // String | ID of specified Resource instance
        try {
            OrganizationTypeSummaryE91ac1399cd410000481d84f988f0ec7 result = apiInstance.organizationTypesIDGet(ID);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling OrganizationTypesApi#organizationTypesIDGet");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ID** | **String**| ID of specified Resource instance |

### Return type

[**OrganizationTypeSummaryE91ac1399cd410000481d84f988f0ec7**](OrganizationTypeSummaryE91ac1399cd410000481d84f988f0ec7.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | getting response |  -  |
| **200** | an error occurred |  -  |

