# BusinessTitleChangesApi

All URIs are relative to *https://&lt;tenant hostname&gt;/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**businessTitleChangesIDGet**](BusinessTitleChangesApi.md#businessTitleChangesIDGet) | **GET** /businessTitleChanges/{ID} | 



## businessTitleChangesIDGet

> BusinessTitleChangeDetailF3169dd3470046378f404ac21e864ab4 businessTitleChangesIDGet(ID)



Secured by: Staffing Actions: Business Title

### Example

```java
// Import classes:
import com.workday.common.ApiClient;
import com.workday.common.ApiException;
import com.workday.common.Configuration;
import com.workday.common.models.*;
import com.workday.common.api.BusinessTitleChangesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://<tenant hostname>/api/v1");

        BusinessTitleChangesApi apiInstance = new BusinessTitleChangesApi(defaultClient);
        String ID = "ID_example"; // String | ID of specified Resource instance
        try {
            BusinessTitleChangeDetailF3169dd3470046378f404ac21e864ab4 result = apiInstance.businessTitleChangesIDGet(ID);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling BusinessTitleChangesApi#businessTitleChangesIDGet");
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

[**BusinessTitleChangeDetailF3169dd3470046378f404ac21e864ab4**](BusinessTitleChangeDetailF3169dd3470046378f404ac21e864ab4.md)

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

