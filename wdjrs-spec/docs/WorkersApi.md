# WorkersApi

All URIs are relative to *https://&lt;tenant hostname&gt;/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**workersGet**](WorkersApi.md#workersGet) | **GET** /workers | 
[**workersIDBusinessTitleChangesGet**](WorkersApi.md#workersIDBusinessTitleChangesGet) | **GET** /workers/{ID}/businessTitleChanges | 
[**workersIDBusinessTitleChangesPost**](WorkersApi.md#workersIDBusinessTitleChangesPost) | **POST** /workers/{ID}/businessTitleChanges | 
[**workersIDBusinessTitleChangesSubresourceIDGet**](WorkersApi.md#workersIDBusinessTitleChangesSubresourceIDGet) | **GET** /workers/{ID}/businessTitleChanges/{subresourceID} | 
[**workersIDDirectReportsGet**](WorkersApi.md#workersIDDirectReportsGet) | **GET** /workers/{ID}/directReports | 
[**workersIDDirectReportsSubresourceIDGet**](WorkersApi.md#workersIDDirectReportsSubresourceIDGet) | **GET** /workers/{ID}/directReports/{subresourceID} | 
[**workersIDGet**](WorkersApi.md#workersIDGet) | **GET** /workers/{ID} | 
[**workersIDHistoryGet**](WorkersApi.md#workersIDHistoryGet) | **GET** /workers/{ID}/history | 
[**workersIDHistorySubresourceIDGet**](WorkersApi.md#workersIDHistorySubresourceIDGet) | **GET** /workers/{ID}/history/{subresourceID} | 
[**workersIDInboxTasksGet**](WorkersApi.md#workersIDInboxTasksGet) | **GET** /workers/{ID}/inboxTasks | 
[**workersIDInboxTasksSubresourceIDGet**](WorkersApi.md#workersIDInboxTasksSubresourceIDGet) | **GET** /workers/{ID}/inboxTasks/{subresourceID} | 
[**workersIDJobChangesPost**](WorkersApi.md#workersIDJobChangesPost) | **POST** /workers/{ID}/jobChanges | 
[**workersIDOrganizationsGet**](WorkersApi.md#workersIDOrganizationsGet) | **GET** /workers/{ID}/organizations | 
[**workersIDOrganizationsSubresourceIDGet**](WorkersApi.md#workersIDOrganizationsSubresourceIDGet) | **GET** /workers/{ID}/organizations/{subresourceID} | 
[**workersIDPaySlipsGet**](WorkersApi.md#workersIDPaySlipsGet) | **GET** /workers/{ID}/paySlips | 
[**workersIDPaySlipsSubresourceIDGet**](WorkersApi.md#workersIDPaySlipsSubresourceIDGet) | **GET** /workers/{ID}/paySlips/{subresourceID} | 
[**workersIDSupervisoryOrganizationsManagedGet**](WorkersApi.md#workersIDSupervisoryOrganizationsManagedGet) | **GET** /workers/{ID}/supervisoryOrganizationsManaged | 
[**workersIDSupervisoryOrganizationsManagedSubresourceIDGet**](WorkersApi.md#workersIDSupervisoryOrganizationsManagedSubresourceIDGet) | **GET** /workers/{ID}/supervisoryOrganizationsManaged/{subresourceID} | 
[**workersIDTimeOffEntriesGet**](WorkersApi.md#workersIDTimeOffEntriesGet) | **GET** /workers/{ID}/timeOffEntries | 
[**workersIDTimeOffEntriesSubresourceIDGet**](WorkersApi.md#workersIDTimeOffEntriesSubresourceIDGet) | **GET** /workers/{ID}/timeOffEntries/{subresourceID} | 
[**workersIDTimeOffPlansGet**](WorkersApi.md#workersIDTimeOffPlansGet) | **GET** /workers/{ID}/timeOffPlans | 
[**workersIDTimeOffPlansSubresourceIDGet**](WorkersApi.md#workersIDTimeOffPlansSubresourceIDGet) | **GET** /workers/{ID}/timeOffPlans/{subresourceID} | 



## workersGet

> InlineResponse200 workersGet(search, limit, offset)



Secured by: Worker Data: Public Worker Reports, Self-Service: Current Staffing Information

### Example

```java
// Import classes:
import com.workday.common.ApiClient;
import com.workday.common.ApiException;
import com.workday.common.Configuration;
import com.workday.common.models.*;
import com.workday.common.api.WorkersApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://<tenant hostname>/api/v1");

        WorkersApi apiInstance = new WorkersApi(defaultClient);
        String search = "search_example"; // String | Searches ~workers~ by name. The search is case-insensitive. You can include space-delimited search strings for an OR search.
        Long limit = 56L; // Long | The number of instances to retrieve
        Long offset = 56L; // Long | The offset in the collection
        try {
            InlineResponse200 result = apiInstance.workersGet(search, limit, offset);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling WorkersApi#workersGet");
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
 **search** | **String**| Searches ~workers~ by name. The search is case-insensitive. You can include space-delimited search strings for an OR search. | [optional]
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


## workersIDBusinessTitleChangesGet

> InlineResponse2003 workersIDBusinessTitleChangesGet(ID, limit, offset)



Secured by: Staffing Actions: Business Title

### Example

```java
// Import classes:
import com.workday.common.ApiClient;
import com.workday.common.ApiException;
import com.workday.common.Configuration;
import com.workday.common.models.*;
import com.workday.common.api.WorkersApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://<tenant hostname>/api/v1");

        WorkersApi apiInstance = new WorkersApi(defaultClient);
        String ID = "ID_example"; // String | ID of specified Resource instance
        Long limit = 56L; // Long | The number of instances to retrieve
        Long offset = 56L; // Long | The offset in the collection
        try {
            InlineResponse2003 result = apiInstance.workersIDBusinessTitleChangesGet(ID, limit, offset);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling WorkersApi#workersIDBusinessTitleChangesGet");
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

[**InlineResponse2003**](InlineResponse2003.md)

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


## workersIDBusinessTitleChangesPost

> BusinessTitleChangeInput0123d0c7e84e4263a53f5d74968690af workersIDBusinessTitleChangesPost(ID, businessTitleChangeInput)



Create a new business title change for the specified worker  Secured by: Change Business Title

### Example

```java
// Import classes:
import com.workday.common.ApiClient;
import com.workday.common.ApiException;
import com.workday.common.Configuration;
import com.workday.common.models.*;
import com.workday.common.api.WorkersApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://<tenant hostname>/api/v1");

        WorkersApi apiInstance = new WorkersApi(defaultClient);
        String ID = "ID_example"; // String | ID of specified Resource instance
        BusinessTitleChangeInput0123d0c7e84e4263a53f5d74968690af businessTitleChangeInput = new BusinessTitleChangeInput0123d0c7e84e4263a53f5d74968690af(); // BusinessTitleChangeInput0123d0c7e84e4263a53f5d74968690af | 
        try {
            BusinessTitleChangeInput0123d0c7e84e4263a53f5d74968690af result = apiInstance.workersIDBusinessTitleChangesPost(ID, businessTitleChangeInput);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling WorkersApi#workersIDBusinessTitleChangesPost");
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
 **businessTitleChangeInput** | [**BusinessTitleChangeInput0123d0c7e84e4263a53f5d74968690af**](BusinessTitleChangeInput0123d0c7e84e4263a53f5d74968690af.md)|  |

### Return type

[**BusinessTitleChangeInput0123d0c7e84e4263a53f5d74968690af**](BusinessTitleChangeInput0123d0c7e84e4263a53f5d74968690af.md)

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


## workersIDBusinessTitleChangesSubresourceIDGet

> BusinessTitleChangeDetailF3169dd3470046378f404ac21e864ab4 workersIDBusinessTitleChangesSubresourceIDGet(ID, subresourceID)



Secured by: Staffing Actions: Business Title

### Example

```java
// Import classes:
import com.workday.common.ApiClient;
import com.workday.common.ApiException;
import com.workday.common.Configuration;
import com.workday.common.models.*;
import com.workday.common.api.WorkersApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://<tenant hostname>/api/v1");

        WorkersApi apiInstance = new WorkersApi(defaultClient);
        String ID = "ID_example"; // String | ID of specified Resource instance
        String subresourceID = "subresourceID_example"; // String | ID of specified Subresource instance
        try {
            BusinessTitleChangeDetailF3169dd3470046378f404ac21e864ab4 result = apiInstance.workersIDBusinessTitleChangesSubresourceIDGet(ID, subresourceID);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling WorkersApi#workersIDBusinessTitleChangesSubresourceIDGet");
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


## workersIDDirectReportsGet

> InlineResponse200 workersIDDirectReportsGet(ID, limit, offset)



Secured by: Reports: Manager, Reports: Matrix Manager, Self-Service: My Team

### Example

```java
// Import classes:
import com.workday.common.ApiClient;
import com.workday.common.ApiException;
import com.workday.common.Configuration;
import com.workday.common.models.*;
import com.workday.common.api.WorkersApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://<tenant hostname>/api/v1");

        WorkersApi apiInstance = new WorkersApi(defaultClient);
        String ID = "ID_example"; // String | ID of specified Resource instance
        Long limit = 56L; // Long | The number of instances to retrieve
        Long offset = 56L; // Long | The offset in the collection
        try {
            InlineResponse200 result = apiInstance.workersIDDirectReportsGet(ID, limit, offset);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling WorkersApi#workersIDDirectReportsGet");
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


## workersIDDirectReportsSubresourceIDGet

> WorkerSummaryA489aef739484c13a59e6d502a9e7b68 workersIDDirectReportsSubresourceIDGet(ID, subresourceID)



Secured by: Reports: Manager, Reports: Matrix Manager, Self-Service: My Team

### Example

```java
// Import classes:
import com.workday.common.ApiClient;
import com.workday.common.ApiException;
import com.workday.common.Configuration;
import com.workday.common.models.*;
import com.workday.common.api.WorkersApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://<tenant hostname>/api/v1");

        WorkersApi apiInstance = new WorkersApi(defaultClient);
        String ID = "ID_example"; // String | ID of specified Resource instance
        String subresourceID = "subresourceID_example"; // String | ID of specified Subresource instance
        try {
            WorkerSummaryA489aef739484c13a59e6d502a9e7b68 result = apiInstance.workersIDDirectReportsSubresourceIDGet(ID, subresourceID);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling WorkersApi#workersIDDirectReportsSubresourceIDGet");
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


## workersIDGet

> WorkerProfileC0a0dce56eb142d39dbffeb505becf7a workersIDGet(ID)



Secured by: Worker Data: Public Worker Reports, Self-Service: Current Staffing Information

### Example

```java
// Import classes:
import com.workday.common.ApiClient;
import com.workday.common.ApiException;
import com.workday.common.Configuration;
import com.workday.common.models.*;
import com.workday.common.api.WorkersApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://<tenant hostname>/api/v1");

        WorkersApi apiInstance = new WorkersApi(defaultClient);
        String ID = "ID_example"; // String | ID of specified Resource instance
        try {
            WorkerProfileC0a0dce56eb142d39dbffeb505becf7a result = apiInstance.workersIDGet(ID);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling WorkersApi#workersIDGet");
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

[**WorkerProfileC0a0dce56eb142d39dbffeb505becf7a**](WorkerProfileC0a0dce56eb142d39dbffeb505becf7a.md)

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


## workersIDHistoryGet

> InlineResponse2006 workersIDHistoryGet(ID, limit, offset)



Secured by: Worker Data: Historical Staffing Information

### Example

```java
// Import classes:
import com.workday.common.ApiClient;
import com.workday.common.ApiException;
import com.workday.common.Configuration;
import com.workday.common.models.*;
import com.workday.common.api.WorkersApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://<tenant hostname>/api/v1");

        WorkersApi apiInstance = new WorkersApi(defaultClient);
        String ID = "ID_example"; // String | ID of specified Resource instance
        Long limit = 56L; // Long | The number of instances to retrieve
        Long offset = 56L; // Long | The offset in the collection
        try {
            InlineResponse2006 result = apiInstance.workersIDHistoryGet(ID, limit, offset);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling WorkersApi#workersIDHistoryGet");
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

[**InlineResponse2006**](InlineResponse2006.md)

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


## workersIDHistorySubresourceIDGet

> BusinessProcessSummary5a3be01347ed4c30b2ab02b28d97b655 workersIDHistorySubresourceIDGet(ID, subresourceID)



Secured by: Worker Data: Historical Staffing Information

### Example

```java
// Import classes:
import com.workday.common.ApiClient;
import com.workday.common.ApiException;
import com.workday.common.Configuration;
import com.workday.common.models.*;
import com.workday.common.api.WorkersApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://<tenant hostname>/api/v1");

        WorkersApi apiInstance = new WorkersApi(defaultClient);
        String ID = "ID_example"; // String | ID of specified Resource instance
        String subresourceID = "subresourceID_example"; // String | ID of specified Subresource instance
        try {
            BusinessProcessSummary5a3be01347ed4c30b2ab02b28d97b655 result = apiInstance.workersIDHistorySubresourceIDGet(ID, subresourceID);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling WorkersApi#workersIDHistorySubresourceIDGet");
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

[**BusinessProcessSummary5a3be01347ed4c30b2ab02b28d97b655**](BusinessProcessSummary5a3be01347ed4c30b2ab02b28d97b655.md)

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


## workersIDInboxTasksGet

> InlineResponse2007 workersIDInboxTasksGet(ID, limit, offset)



Secured by: Core Navigation

### Example

```java
// Import classes:
import com.workday.common.ApiClient;
import com.workday.common.ApiException;
import com.workday.common.Configuration;
import com.workday.common.models.*;
import com.workday.common.api.WorkersApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://<tenant hostname>/api/v1");

        WorkersApi apiInstance = new WorkersApi(defaultClient);
        String ID = "ID_example"; // String | ID of specified Resource instance
        Long limit = 56L; // Long | The number of instances to retrieve
        Long offset = 56L; // Long | The offset in the collection
        try {
            InlineResponse2007 result = apiInstance.workersIDInboxTasksGet(ID, limit, offset);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling WorkersApi#workersIDInboxTasksGet");
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

[**InlineResponse2007**](InlineResponse2007.md)

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


## workersIDInboxTasksSubresourceIDGet

> InboxTaskSummary1bbb07a8ab4349dd934ca72301974204 workersIDInboxTasksSubresourceIDGet(ID, subresourceID)



Secured by: Core Navigation

### Example

```java
// Import classes:
import com.workday.common.ApiClient;
import com.workday.common.ApiException;
import com.workday.common.Configuration;
import com.workday.common.models.*;
import com.workday.common.api.WorkersApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://<tenant hostname>/api/v1");

        WorkersApi apiInstance = new WorkersApi(defaultClient);
        String ID = "ID_example"; // String | ID of specified Resource instance
        String subresourceID = "subresourceID_example"; // String | ID of specified Subresource instance
        try {
            InboxTaskSummary1bbb07a8ab4349dd934ca72301974204 result = apiInstance.workersIDInboxTasksSubresourceIDGet(ID, subresourceID);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling WorkersApi#workersIDInboxTasksSubresourceIDGet");
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

[**InboxTaskSummary1bbb07a8ab4349dd934ca72301974204**](InboxTaskSummary1bbb07a8ab4349dd934ca72301974204.md)

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


## workersIDJobChangesPost

> ChangeJobInputCadd132f15994dc3bcda042ae1c90629 workersIDJobChangesPost(ID, changeJobInput)



Initiate a job change for the specified worker.  Secured by: Change Job

### Example

```java
// Import classes:
import com.workday.common.ApiClient;
import com.workday.common.ApiException;
import com.workday.common.Configuration;
import com.workday.common.models.*;
import com.workday.common.api.WorkersApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://<tenant hostname>/api/v1");

        WorkersApi apiInstance = new WorkersApi(defaultClient);
        String ID = "ID_example"; // String | ID of specified Resource instance
        ChangeJobInputCadd132f15994dc3bcda042ae1c90629 changeJobInput = new ChangeJobInputCadd132f15994dc3bcda042ae1c90629(); // ChangeJobInputCadd132f15994dc3bcda042ae1c90629 | 
        try {
            ChangeJobInputCadd132f15994dc3bcda042ae1c90629 result = apiInstance.workersIDJobChangesPost(ID, changeJobInput);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling WorkersApi#workersIDJobChangesPost");
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
 **changeJobInput** | [**ChangeJobInputCadd132f15994dc3bcda042ae1c90629**](ChangeJobInputCadd132f15994dc3bcda042ae1c90629.md)|  |

### Return type

[**ChangeJobInputCadd132f15994dc3bcda042ae1c90629**](ChangeJobInputCadd132f15994dc3bcda042ae1c90629.md)

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


## workersIDOrganizationsGet

> InlineResponse2001 workersIDOrganizationsGet(ID, limit, offset)



Secured by: Reports: Organization

### Example

```java
// Import classes:
import com.workday.common.ApiClient;
import com.workday.common.ApiException;
import com.workday.common.Configuration;
import com.workday.common.models.*;
import com.workday.common.api.WorkersApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://<tenant hostname>/api/v1");

        WorkersApi apiInstance = new WorkersApi(defaultClient);
        String ID = "ID_example"; // String | ID of specified Resource instance
        Long limit = 56L; // Long | The number of instances to retrieve
        Long offset = 56L; // Long | The offset in the collection
        try {
            InlineResponse2001 result = apiInstance.workersIDOrganizationsGet(ID, limit, offset);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling WorkersApi#workersIDOrganizationsGet");
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

[**InlineResponse2001**](InlineResponse2001.md)

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


## workersIDOrganizationsSubresourceIDGet

> WorkerOrganizationSummaryB09201ecbe6f10000c600196a3f70012 workersIDOrganizationsSubresourceIDGet(ID, subresourceID)



Secured by: Reports: Organization

### Example

```java
// Import classes:
import com.workday.common.ApiClient;
import com.workday.common.ApiException;
import com.workday.common.Configuration;
import com.workday.common.models.*;
import com.workday.common.api.WorkersApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://<tenant hostname>/api/v1");

        WorkersApi apiInstance = new WorkersApi(defaultClient);
        String ID = "ID_example"; // String | ID of specified Resource instance
        String subresourceID = "subresourceID_example"; // String | ID of specified Subresource instance
        try {
            WorkerOrganizationSummaryB09201ecbe6f10000c600196a3f70012 result = apiInstance.workersIDOrganizationsSubresourceIDGet(ID, subresourceID);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling WorkersApi#workersIDOrganizationsSubresourceIDGet");
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

[**WorkerOrganizationSummaryB09201ecbe6f10000c600196a3f70012**](WorkerOrganizationSummaryB09201ecbe6f10000c600196a3f70012.md)

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


## workersIDPaySlipsGet

> InlineResponse2008 workersIDPaySlipsGet(ID, limit, offset)



Secured by: Worker Data: Payroll (Payslips), Self-Service: Payroll (My Payslips)

### Example

```java
// Import classes:
import com.workday.common.ApiClient;
import com.workday.common.ApiException;
import com.workday.common.Configuration;
import com.workday.common.models.*;
import com.workday.common.api.WorkersApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://<tenant hostname>/api/v1");

        WorkersApi apiInstance = new WorkersApi(defaultClient);
        String ID = "ID_example"; // String | ID of specified Resource instance
        Long limit = 56L; // Long | The number of instances to retrieve
        Long offset = 56L; // Long | The offset in the collection
        try {
            InlineResponse2008 result = apiInstance.workersIDPaySlipsGet(ID, limit, offset);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling WorkersApi#workersIDPaySlipsGet");
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

[**InlineResponse2008**](InlineResponse2008.md)

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


## workersIDPaySlipsSubresourceIDGet

> PaySlipSummary056982a2aa04100005cc479e6e5a0022 workersIDPaySlipsSubresourceIDGet(ID, subresourceID)



Secured by: Worker Data: Payroll (Payslips), Self-Service: Payroll (My Payslips)

### Example

```java
// Import classes:
import com.workday.common.ApiClient;
import com.workday.common.ApiException;
import com.workday.common.Configuration;
import com.workday.common.models.*;
import com.workday.common.api.WorkersApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://<tenant hostname>/api/v1");

        WorkersApi apiInstance = new WorkersApi(defaultClient);
        String ID = "ID_example"; // String | ID of specified Resource instance
        String subresourceID = "subresourceID_example"; // String | ID of specified Subresource instance
        try {
            PaySlipSummary056982a2aa04100005cc479e6e5a0022 result = apiInstance.workersIDPaySlipsSubresourceIDGet(ID, subresourceID);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling WorkersApi#workersIDPaySlipsSubresourceIDGet");
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

[**PaySlipSummary056982a2aa04100005cc479e6e5a0022**](PaySlipSummary056982a2aa04100005cc479e6e5a0022.md)

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


## workersIDSupervisoryOrganizationsManagedGet

> InlineResponse2004 workersIDSupervisoryOrganizationsManagedGet(ID, limit, offset)



Secured by: Reports: Organization

### Example

```java
// Import classes:
import com.workday.common.ApiClient;
import com.workday.common.ApiException;
import com.workday.common.Configuration;
import com.workday.common.models.*;
import com.workday.common.api.WorkersApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://<tenant hostname>/api/v1");

        WorkersApi apiInstance = new WorkersApi(defaultClient);
        String ID = "ID_example"; // String | ID of specified Resource instance
        Long limit = 56L; // Long | The number of instances to retrieve
        Long offset = 56L; // Long | The offset in the collection
        try {
            InlineResponse2004 result = apiInstance.workersIDSupervisoryOrganizationsManagedGet(ID, limit, offset);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling WorkersApi#workersIDSupervisoryOrganizationsManagedGet");
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


## workersIDSupervisoryOrganizationsManagedSubresourceIDGet

> SupervisoryOrganizationSummary3a94b57f042a4ebb95027e09d6192992 workersIDSupervisoryOrganizationsManagedSubresourceIDGet(ID, subresourceID)



Secured by: Reports: Organization

### Example

```java
// Import classes:
import com.workday.common.ApiClient;
import com.workday.common.ApiException;
import com.workday.common.Configuration;
import com.workday.common.models.*;
import com.workday.common.api.WorkersApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://<tenant hostname>/api/v1");

        WorkersApi apiInstance = new WorkersApi(defaultClient);
        String ID = "ID_example"; // String | ID of specified Resource instance
        String subresourceID = "subresourceID_example"; // String | ID of specified Subresource instance
        try {
            SupervisoryOrganizationSummary3a94b57f042a4ebb95027e09d6192992 result = apiInstance.workersIDSupervisoryOrganizationsManagedSubresourceIDGet(ID, subresourceID);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling WorkersApi#workersIDSupervisoryOrganizationsManagedSubresourceIDGet");
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


## workersIDTimeOffEntriesGet

> InlineResponse2002 workersIDTimeOffEntriesGet(ID, limit, offset)



Secured by: Worker Data: Time Off (Time Off Balances), Worker Data: Time Off (Time Off Balances Manager View), Self-Service: Time Off Balances

### Example

```java
// Import classes:
import com.workday.common.ApiClient;
import com.workday.common.ApiException;
import com.workday.common.Configuration;
import com.workday.common.models.*;
import com.workday.common.api.WorkersApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://<tenant hostname>/api/v1");

        WorkersApi apiInstance = new WorkersApi(defaultClient);
        String ID = "ID_example"; // String | ID of specified Resource instance
        Long limit = 56L; // Long | The number of instances to retrieve
        Long offset = 56L; // Long | The offset in the collection
        try {
            InlineResponse2002 result = apiInstance.workersIDTimeOffEntriesGet(ID, limit, offset);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling WorkersApi#workersIDTimeOffEntriesGet");
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

[**InlineResponse2002**](InlineResponse2002.md)

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


## workersIDTimeOffEntriesSubresourceIDGet

> TimeOffEntries436f2afb755f100012528fa3260e000f workersIDTimeOffEntriesSubresourceIDGet(ID, subresourceID)



Secured by: Worker Data: Time Off (Time Off Balances), Worker Data: Time Off (Time Off Balances Manager View), Self-Service: Time Off Balances

### Example

```java
// Import classes:
import com.workday.common.ApiClient;
import com.workday.common.ApiException;
import com.workday.common.Configuration;
import com.workday.common.models.*;
import com.workday.common.api.WorkersApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://<tenant hostname>/api/v1");

        WorkersApi apiInstance = new WorkersApi(defaultClient);
        String ID = "ID_example"; // String | ID of specified Resource instance
        String subresourceID = "subresourceID_example"; // String | ID of specified Subresource instance
        try {
            TimeOffEntries436f2afb755f100012528fa3260e000f result = apiInstance.workersIDTimeOffEntriesSubresourceIDGet(ID, subresourceID);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling WorkersApi#workersIDTimeOffEntriesSubresourceIDGet");
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

[**TimeOffEntries436f2afb755f100012528fa3260e000f**](TimeOffEntries436f2afb755f100012528fa3260e000f.md)

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


## workersIDTimeOffPlansGet

> InlineResponse2005 workersIDTimeOffPlansGet(ID, limit, offset)



Secured by: Worker Data: Time Off (Time Off Balances), Worker Data: Time Off (Time Off Balances Manager View), Self-Service: Time Off Balances

### Example

```java
// Import classes:
import com.workday.common.ApiClient;
import com.workday.common.ApiException;
import com.workday.common.Configuration;
import com.workday.common.models.*;
import com.workday.common.api.WorkersApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://<tenant hostname>/api/v1");

        WorkersApi apiInstance = new WorkersApi(defaultClient);
        String ID = "ID_example"; // String | ID of specified Resource instance
        Long limit = 56L; // Long | The number of instances to retrieve
        Long offset = 56L; // Long | The offset in the collection
        try {
            InlineResponse2005 result = apiInstance.workersIDTimeOffPlansGet(ID, limit, offset);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling WorkersApi#workersIDTimeOffPlansGet");
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

[**InlineResponse2005**](InlineResponse2005.md)

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


## workersIDTimeOffPlansSubresourceIDGet

> TimeOffPlans581c389cce1410000feacaebd2e40002 workersIDTimeOffPlansSubresourceIDGet(ID, subresourceID)



Secured by: Worker Data: Time Off (Time Off Balances), Worker Data: Time Off (Time Off Balances Manager View), Self-Service: Time Off Balances

### Example

```java
// Import classes:
import com.workday.common.ApiClient;
import com.workday.common.ApiException;
import com.workday.common.Configuration;
import com.workday.common.models.*;
import com.workday.common.api.WorkersApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://<tenant hostname>/api/v1");

        WorkersApi apiInstance = new WorkersApi(defaultClient);
        String ID = "ID_example"; // String | ID of specified Resource instance
        String subresourceID = "subresourceID_example"; // String | ID of specified Subresource instance
        try {
            TimeOffPlans581c389cce1410000feacaebd2e40002 result = apiInstance.workersIDTimeOffPlansSubresourceIDGet(ID, subresourceID);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling WorkersApi#workersIDTimeOffPlansSubresourceIDGet");
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

[**TimeOffPlans581c389cce1410000feacaebd2e40002**](TimeOffPlans581c389cce1410000feacaebd2e40002.md)

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

