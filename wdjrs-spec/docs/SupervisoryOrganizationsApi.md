# SupervisoryOrganizationsApi

All URIs are relative to *https://&lt;tenant hostname&gt;/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**supervisoryOrganizationsGet**](SupervisoryOrganizationsApi.md#supervisoryOrganizationsGet) | **GET** /supervisoryOrganizations | 
[**supervisoryOrganizationsIDGet**](SupervisoryOrganizationsApi.md#supervisoryOrganizationsIDGet) | **GET** /supervisoryOrganizations/{ID} | 
[**supervisoryOrganizationsIDWorkersGet**](SupervisoryOrganizationsApi.md#supervisoryOrganizationsIDWorkersGet) | **GET** /supervisoryOrganizations/{ID}/workers | 
[**supervisoryOrganizationsIDWorkersSubresourceIDGet**](SupervisoryOrganizationsApi.md#supervisoryOrganizationsIDWorkersSubresourceIDGet) | **GET** /supervisoryOrganizations/{ID}/workers/{subresourceID} | 



## supervisoryOrganizationsGet

> InlineResponse2004 supervisoryOrganizationsGet(limit, offset)



Secured by: Reports: Organization

### Example

```java
// Import classes:
import com.workday.common.ApiClient;
import com.workday.common.ApiException;
import com.workday.common.Configuration;
import com.workday.common.models.*;
import com.workday.common.api.SupervisoryOrganizationsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://<tenant hostname>/api/v1");

        SupervisoryOrganizationsApi apiInstance = new SupervisoryOrganizationsApi(defaultClient);
        Long limit = 56L; // Long | The number of instances to retrieve
        Long offset = 56L; // Long | The offset in the collection
        try {
            InlineResponse2004 result = apiInstance.supervisoryOrganizationsGet(limit, offset);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SupervisoryOrganizationsApi#supervisoryOrganizationsGet");
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

[**InlineResponse2004**](InlineResponse2004.md)

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


## supervisoryOrganizationsIDGet

> SupervisoryOrganizationSummary3a94b57f042a4ebb95027e09d6192992 supervisoryOrganizationsIDGet(ID)



Secured by: Reports: Organization

### Example

```java
// Import classes:
import com.workday.common.ApiClient;
import com.workday.common.ApiException;
import com.workday.common.Configuration;
import com.workday.common.models.*;
import com.workday.common.api.SupervisoryOrganizationsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://<tenant hostname>/api/v1");

        SupervisoryOrganizationsApi apiInstance = new SupervisoryOrganizationsApi(defaultClient);
        String ID = "ID_example"; // String | ID of specified Resource instance
        try {
            SupervisoryOrganizationSummary3a94b57f042a4ebb95027e09d6192992 result = apiInstance.supervisoryOrganizationsIDGet(ID);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SupervisoryOrganizationsApi#supervisoryOrganizationsIDGet");
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

[**SupervisoryOrganizationSummary3a94b57f042a4ebb95027e09d6192992**](SupervisoryOrganizationSummary3a94b57f042a4ebb95027e09d6192992.md)

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


## supervisoryOrganizationsIDWorkersGet

> InlineResponse200 supervisoryOrganizationsIDWorkersGet(ID, limit, offset)



Secured by: Worker Data: Public Worker Reports

### Example

```java
// Import classes:
import com.workday.common.ApiClient;
import com.workday.common.ApiException;
import com.workday.common.Configuration;
import com.workday.common.models.*;
import com.workday.common.api.SupervisoryOrganizationsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://<tenant hostname>/api/v1");

        SupervisoryOrganizationsApi apiInstance = new SupervisoryOrganizationsApi(defaultClient);
        String ID = "ID_example"; // String | ID of specified Resource instance
        Long limit = 56L; // Long | The number of instances to retrieve
        Long offset = 56L; // Long | The offset in the collection
        try {
            InlineResponse200 result = apiInstance.supervisoryOrganizationsIDWorkersGet(ID, limit, offset);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SupervisoryOrganizationsApi#supervisoryOrganizationsIDWorkersGet");
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
 **limit** | **Long**| The number of instances to retrieve | [optional]
 **offset** | **Long**| The offset in the collection | [optional]

### Return type

[**InlineResponse200**](InlineResponse200.md)

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


## supervisoryOrganizationsIDWorkersSubresourceIDGet

> WorkerSummaryA489aef739484c13a59e6d502a9e7b68 supervisoryOrganizationsIDWorkersSubresourceIDGet(ID, subresourceID)



Secured by: Worker Data: Public Worker Reports

### Example

```java
// Import classes:
import com.workday.common.ApiClient;
import com.workday.common.ApiException;
import com.workday.common.Configuration;
import com.workday.common.models.*;
import com.workday.common.api.SupervisoryOrganizationsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://<tenant hostname>/api/v1");

        SupervisoryOrganizationsApi apiInstance = new SupervisoryOrganizationsApi(defaultClient);
        String ID = "ID_example"; // String | ID of specified Resource instance
        String subresourceID = "subresourceID_example"; // String | ID of specified Subresource instance
        try {
            WorkerSummaryA489aef739484c13a59e6d502a9e7b68 result = apiInstance.supervisoryOrganizationsIDWorkersSubresourceIDGet(ID, subresourceID);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SupervisoryOrganizationsApi#supervisoryOrganizationsIDWorkersSubresourceIDGet");
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
 **subresourceID** | **String**| ID of specified Subresource instance |

### Return type

[**WorkerSummaryA489aef739484c13a59e6d502a9e7b68**](WorkerSummaryA489aef739484c13a59e6d502a9e7b68.md)

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

