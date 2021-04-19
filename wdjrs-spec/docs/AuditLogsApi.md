# AuditLogsApi

All URIs are relative to *https://&lt;tenant hostname&gt;/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**auditLogsGet**](AuditLogsApi.md#auditLogsGet) | **GET** /auditLogs | 
[**auditLogsIDGet**](AuditLogsApi.md#auditLogsIDGet) | **GET** /auditLogs/{ID} | 



## auditLogsGet

> InlineResponse20010 auditLogsGet(returnUserActivityEntryCount, systemAccount, taskId, from, to, limit, offset)



Secured by: System Auditing

### Example

```java
// Import classes:
import com.workday.common.ApiClient;
import com.workday.common.ApiException;
import com.workday.common.Configuration;
import com.workday.common.models.*;
import com.workday.common.api.AuditLogsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://<tenant hostname>/api/v1");

        AuditLogsApi apiInstance = new AuditLogsApi(defaultClient);
        Boolean returnUserActivityEntryCount = true; // Boolean | Boolean
        String systemAccount = "systemAccount_example"; // String | The system account that initiated the request.
        String taskId = "taskId_example"; // String | The Workday ID of the task executed in the transaction.
        String from = "from_example"; // String | Returns value entered in \"From Moment\" parm
        String to = "to_example"; // String | Returns value entered in \"To Moment\" parm
        Long limit = 56L; // Long | The number of instances to retrieve
        Long offset = 56L; // Long | The offset in the collection
        try {
            InlineResponse20010 result = apiInstance.auditLogsGet(returnUserActivityEntryCount, systemAccount, taskId, from, to, limit, offset);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AuditLogsApi#auditLogsGet");
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
 **returnUserActivityEntryCount** | **Boolean**| Boolean | [optional]
 **systemAccount** | **String**| The system account that initiated the request. | [optional]
 **taskId** | **String**| The Workday ID of the task executed in the transaction. | [optional]
 **from** | **String**| Returns value entered in \&quot;From Moment\&quot; parm | [optional]
 **to** | **String**| Returns value entered in \&quot;To Moment\&quot; parm | [optional]
 **limit** | **Long**| The number of instances to retrieve | [optional]
 **offset** | **Long**| The offset in the collection | [optional]

### Return type

[**InlineResponse20010**](InlineResponse20010.md)

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


## auditLogsIDGet

> UserActivityTrackingAc0016a29fb810000d25a655d2740b94 auditLogsIDGet(ID)



Secured by: System Auditing

### Example

```java
// Import classes:
import com.workday.common.ApiClient;
import com.workday.common.ApiException;
import com.workday.common.Configuration;
import com.workday.common.models.*;
import com.workday.common.api.AuditLogsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://<tenant hostname>/api/v1");

        AuditLogsApi apiInstance = new AuditLogsApi(defaultClient);
        String ID = "ID_example"; // String | ID of specified Resource instance
        try {
            UserActivityTrackingAc0016a29fb810000d25a655d2740b94 result = apiInstance.auditLogsIDGet(ID);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AuditLogsApi#auditLogsIDGet");
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

[**UserActivityTrackingAc0016a29fb810000d25a655d2740b94**](UserActivityTrackingAc0016a29fb810000d25a655d2740b94.md)

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

