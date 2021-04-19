# ValidateWorktagsApi

All URIs are relative to *https://&lt;tenant hostname&gt;/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**validateWorktagsPost**](ValidateWorktagsApi.md#validateWorktagsPost) | **POST** /validateWorktags | 



## validateWorktagsPost

> ValidateWorktagInputAa8aaaaeca3910002fd14d954eea0371 validateWorktagsPost(validateWorktagInput)



Secured by: Manage: Related Worktags, Worktag REST API

### Example

```java
// Import classes:
import com.workday.common.ApiClient;
import com.workday.common.ApiException;
import com.workday.common.Configuration;
import com.workday.common.models.*;
import com.workday.common.api.ValidateWorktagsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://<tenant hostname>/api/v1");

        ValidateWorktagsApi apiInstance = new ValidateWorktagsApi(defaultClient);
        ValidateWorktagInputAa8aaaaeca3910002fd14d954eea0371 validateWorktagInput = new ValidateWorktagInputAa8aaaaeca3910002fd14d954eea0371(); // ValidateWorktagInputAa8aaaaeca3910002fd14d954eea0371 | 
        try {
            ValidateWorktagInputAa8aaaaeca3910002fd14d954eea0371 result = apiInstance.validateWorktagsPost(validateWorktagInput);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ValidateWorktagsApi#validateWorktagsPost");
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
 **validateWorktagInput** | [**ValidateWorktagInputAa8aaaaeca3910002fd14d954eea0371**](ValidateWorktagInputAa8aaaaeca3910002fd14d954eea0371.md)|  |

### Return type

[**ValidateWorktagInputAa8aaaaeca3910002fd14d954eea0371**](ValidateWorktagInputAa8aaaaeca3910002fd14d954eea0371.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | posting response |  -  |
| **400** | a validation error occurred (https://community.workday.com/rest/error-messages) |  -  |
| **200** | an error occurred |  -  |

