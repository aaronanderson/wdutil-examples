# CurrenciesApi

All URIs are relative to *https://&lt;tenant hostname&gt;/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**currenciesGet**](CurrenciesApi.md#currenciesGet) | **GET** /currencies | 
[**currenciesIDGet**](CurrenciesApi.md#currenciesIDGet) | **GET** /currencies/{ID} | 



## currenciesGet

> InlineResponse2009 currenciesGet(limit, offset)



Secured by: Core Navigation

### Example

```java
// Import classes:
import com.workday.common.ApiClient;
import com.workday.common.ApiException;
import com.workday.common.Configuration;
import com.workday.common.models.*;
import com.workday.common.api.CurrenciesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://<tenant hostname>/api/v1");

        CurrenciesApi apiInstance = new CurrenciesApi(defaultClient);
        Long limit = 56L; // Long | The number of instances to retrieve
        Long offset = 56L; // Long | The offset in the collection
        try {
            InlineResponse2009 result = apiInstance.currenciesGet(limit, offset);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CurrenciesApi#currenciesGet");
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

[**InlineResponse2009**](InlineResponse2009.md)

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


## currenciesIDGet

> CurrencySummary7ceb0e9ce857100019c6099ce1ad00fa currenciesIDGet(ID)



Secured by: Core Navigation

### Example

```java
// Import classes:
import com.workday.common.ApiClient;
import com.workday.common.ApiException;
import com.workday.common.Configuration;
import com.workday.common.models.*;
import com.workday.common.api.CurrenciesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://<tenant hostname>/api/v1");

        CurrenciesApi apiInstance = new CurrenciesApi(defaultClient);
        String ID = "ID_example"; // String | ID of specified Resource instance
        try {
            CurrencySummary7ceb0e9ce857100019c6099ce1ad00fa result = apiInstance.currenciesIDGet(ID);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CurrenciesApi#currenciesIDGet");
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

[**CurrencySummary7ceb0e9ce857100019c6099ce1ad00fa**](CurrencySummary7ceb0e9ce857100019c6099ce1ad00fa.md)

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

