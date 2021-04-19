# CustomersApi

All URIs are relative to *https://&lt;tenant hostname&gt;/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**customersIDActivitiesGet**](CustomersApi.md#customersIDActivitiesGet) | **GET** /customers/{ID}/activities | 
[**customersIDActivitiesSubresourceIDGet**](CustomersApi.md#customersIDActivitiesSubresourceIDGet) | **GET** /customers/{ID}/activities/{subresourceID} | 
[**customersIDGet**](CustomersApi.md#customersIDGet) | **GET** /customers/{ID} | 



## customersIDActivitiesGet

> InlineResponse20012 customersIDActivitiesGet(ID, toDate, fromDate, limit, offset)



Secured by: Reports: Customer Accounts

### Example

```java
// Import classes:
import com.workday.common.ApiClient;
import com.workday.common.ApiException;
import com.workday.common.Configuration;
import com.workday.common.models.*;
import com.workday.common.api.CustomersApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://<tenant hostname>/api/v1");

        CustomersApi apiInstance = new CustomersApi(defaultClient);
        String ID = "ID_example"; // String | ID of specified Resource instance
        String toDate = "toDate_example"; // String | The transaction date for the reporting transaction.  NOTE: If used a filtering criteria for expense reports, please use Expense Report Date report field instead to improve performance.
        String fromDate = "fromDate_example"; // String | The transaction date for the reporting transaction.  NOTE: If used a filtering criteria for expense reports, please use Expense Report Date report field instead to improve performance.
        Long limit = 56L; // Long | The number of instances to retrieve
        Long offset = 56L; // Long | The offset in the collection
        try {
            InlineResponse20012 result = apiInstance.customersIDActivitiesGet(ID, toDate, fromDate, limit, offset);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CustomersApi#customersIDActivitiesGet");
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
 **toDate** | **String**| The transaction date for the reporting transaction.  NOTE: If used a filtering criteria for expense reports, please use Expense Report Date report field instead to improve performance. | [optional]
 **fromDate** | **String**| The transaction date for the reporting transaction.  NOTE: If used a filtering criteria for expense reports, please use Expense Report Date report field instead to improve performance. | [optional]
 **limit** | **Long**| The number of instances to retrieve | [optional]
 **offset** | **Long**| The offset in the collection | [optional]

### Return type

[**InlineResponse20012**](InlineResponse20012.md)

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


## customersIDActivitiesSubresourceIDGet

> ActivityBb1fcf6de05b100009ce64e02ac43c08 customersIDActivitiesSubresourceIDGet(ID, subresourceID)



Secured by: Reports: Customer Accounts

### Example

```java
// Import classes:
import com.workday.common.ApiClient;
import com.workday.common.ApiException;
import com.workday.common.Configuration;
import com.workday.common.models.*;
import com.workday.common.api.CustomersApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://<tenant hostname>/api/v1");

        CustomersApi apiInstance = new CustomersApi(defaultClient);
        String ID = "ID_example"; // String | ID of specified Resource instance
        String subresourceID = "subresourceID_example"; // String | ID of specified Subresource instance
        try {
            ActivityBb1fcf6de05b100009ce64e02ac43c08 result = apiInstance.customersIDActivitiesSubresourceIDGet(ID, subresourceID);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CustomersApi#customersIDActivitiesSubresourceIDGet");
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

[**ActivityBb1fcf6de05b100009ce64e02ac43c08**](ActivityBb1fcf6de05b100009ce64e02ac43c08.md)

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


## customersIDGet

> CustomerB7ecfe5ec60c10000aa161405fa5002c customersIDGet(ID)



Secured by: View: Customer

### Example

```java
// Import classes:
import com.workday.common.ApiClient;
import com.workday.common.ApiException;
import com.workday.common.Configuration;
import com.workday.common.models.*;
import com.workday.common.api.CustomersApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://<tenant hostname>/api/v1");

        CustomersApi apiInstance = new CustomersApi(defaultClient);
        String ID = "ID_example"; // String | ID of specified Resource instance
        try {
            CustomerB7ecfe5ec60c10000aa161405fa5002c result = apiInstance.customersIDGet(ID);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CustomersApi#customersIDGet");
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

[**CustomerB7ecfe5ec60c10000aa161405fa5002c**](CustomerB7ecfe5ec60c10000aa161405fa5002c.md)

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

