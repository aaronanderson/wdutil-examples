# JobChangeReasonsApi

All URIs are relative to *https://&lt;tenant hostname&gt;/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**jobChangeReasonsGet**](JobChangeReasonsApi.md#jobChangeReasonsGet) | **GET** /jobChangeReasons | 
[**jobChangeReasonsIDGet**](JobChangeReasonsApi.md#jobChangeReasonsIDGet) | **GET** /jobChangeReasons/{ID} | 



## jobChangeReasonsGet

> InlineResponse20011 jobChangeReasonsGet(limit, offset)



Secured by: Staffing Actions: Change Job Date and Reason

### Example

```java
// Import classes:
import com.workday.common.ApiClient;
import com.workday.common.ApiException;
import com.workday.common.Configuration;
import com.workday.common.models.*;
import com.workday.common.api.JobChangeReasonsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://<tenant hostname>/api/v1");

        JobChangeReasonsApi apiInstance = new JobChangeReasonsApi(defaultClient);
        Long limit = 56L; // Long | The number of instances to retrieve
        Long offset = 56L; // Long | The offset in the collection
        try {
            InlineResponse20011 result = apiInstance.jobChangeReasonsGet(limit, offset);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling JobChangeReasonsApi#jobChangeReasonsGet");
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

[**InlineResponse20011**](InlineResponse20011.md)

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


## jobChangeReasonsIDGet

> JobChangeReasonSummary69b1f5fbb40c4cd6b9c55b226ca2424c jobChangeReasonsIDGet(ID)



Secured by: Staffing Actions: Change Job Date and Reason

### Example

```java
// Import classes:
import com.workday.common.ApiClient;
import com.workday.common.ApiException;
import com.workday.common.Configuration;
import com.workday.common.models.*;
import com.workday.common.api.JobChangeReasonsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://<tenant hostname>/api/v1");

        JobChangeReasonsApi apiInstance = new JobChangeReasonsApi(defaultClient);
        String ID = "ID_example"; // String | ID of specified Resource instance
        try {
            JobChangeReasonSummary69b1f5fbb40c4cd6b9c55b226ca2424c result = apiInstance.jobChangeReasonsIDGet(ID);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling JobChangeReasonsApi#jobChangeReasonsIDGet");
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

[**JobChangeReasonSummary69b1f5fbb40c4cd6b9c55b226ca2424c**](JobChangeReasonSummary69b1f5fbb40c4cd6b9c55b226ca2424c.md)

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

