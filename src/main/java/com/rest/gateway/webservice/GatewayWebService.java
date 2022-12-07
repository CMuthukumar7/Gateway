package com.rest.gateway.webservice;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

import com.rest.gateway.helper.ApplicationProperties;
import com.rest.gateway.helper.GatewayHelper;

@RestController
@RequestMapping("/v1")
public class GatewayWebService {

	private final Logger log = LoggerFactory.getLogger(GatewayWebService.class);

	@Autowired
	private RestTemplate restTemplate;

	@Autowired
	private ApplicationProperties applicationProperties;

	public String getUrl(String url) {
		log.info("Endpoint Url value : {}", url);
		return url;
	}

	@PostMapping(value = "/registration-request")
	public Object registrationRequest(@RequestBody Object request) throws Exception {

		log.info("*********************************** ENTER ***********************************");
		log.info("Entered inside Registration Request api request value : {} ", request);
		Object response = restTemplate.postForObject(
				getUrl(applicationProperties.getFabUrl() + "/directdebit/v1/registration-request"),
				new HttpEntity<>(request, GatewayHelper.getHeaders()), Object.class);
		log.info("Response from registration request api response value : {} ", response);
		log.info("*********************************** EXIT ***********************************");
		return response;

	}

	@PostMapping(value = "/registration-status")
	public Object registrationStatus(@RequestBody Object request) throws Exception {

		log.info("*********************************** ENTER ***********************************");
		log.info("Entered inside Registration Status api request value : {} ", request);
		Object response = restTemplate.postForObject(
				getUrl(applicationProperties.getFabUrl() + "/directdebit/v1/registration-status"),
				new HttpEntity<>(request, GatewayHelper.getHeaders()), Object.class);
		log.info("Response from registration Status api response value : {} ", response);
		log.info("*********************************** EXIT ***********************************");
		return response;

	}

	@PostMapping(value = "/information")
	public Object information(@RequestBody Object request) throws Exception {

		log.info("*********************************** ENTER ***********************************");
		log.info("Entered inside information api request value : {} ", request);
		Object response = restTemplate.postForObject(
				getUrl(applicationProperties.getFabUrl() + "/directdebit/v1/information"),
				new HttpEntity<>(request, GatewayHelper.getHeaders()), Object.class);
		log.info("Response from information api response value : {} ", response);
		log.info("*********************************** EXIT ***********************************");
		return response;

	}

	@PostMapping(value = "/cancel-request")
	public Object cancelRequest(@RequestBody Object request) throws Exception {

		log.info("*********************************** ENTER ***********************************");
		log.info("Entered inside cancel request api request value : {} ", request);
		Object response = restTemplate.postForObject(
				getUrl(applicationProperties.getFabUrl() + "/directdebit/v1/cancel-request"),
				new HttpEntity<>(request, GatewayHelper.getHeaders()), Object.class);
		log.info("Response from cancel request api response value : {} ", response);
		log.info("*********************************** EXIT ***********************************");
		return response;

	}

	@PostMapping(value = "/cancellation-status")
	public Object cancellationStatus(@RequestBody Object request) throws Exception {

		log.info("*********************************** ENTER ***********************************");
		log.info("Entered inside cancellation status api request value : {} ", request);
		Object response = restTemplate.postForObject(
				getUrl(applicationProperties.getFabUrl() + "/directdebit/v1/cancellation-status"),
				new HttpEntity<>(request, GatewayHelper.getHeaders()), Object.class);
		log.info("Response from cancellation status api response value : {} ", response);
		log.info("*********************************** EXIT ***********************************");
		return response;

	}

	@PostMapping(value = "/collection-request")
	public Object collectionRequest(@RequestBody Object request) throws Exception {

		log.info("*********************************** ENTER ***********************************");
		log.info("Entered inside Collection Request api request value : {} ", request);
		Object response = restTemplate.postForObject(
				getUrl(applicationProperties.getFabUrl() + "/directdebit/v1/collection-request"),
				new HttpEntity<>(request, GatewayHelper.getHeaders()), Object.class);
		log.info("Response from Collection Request api response value : {} ", response);
		log.info("*********************************** EXIT ***********************************");
		return response;

	}

	@PostMapping(value = "/collection-status")
	public Object collectionStatus(@RequestBody Object request) throws Exception {

		log.info("*********************************** ENTER ***********************************");
		log.info("Entered inside Collection Status api request value : {} ", request);
		Object response = restTemplate.postForObject(
				getUrl(applicationProperties.getFabUrl() + "/directdebit/v1/collection-status"),
				new HttpEntity<>(request, GatewayHelper.getHeaders()), Object.class);
		log.info("Response from Collection Request api response value : {} ", response);
		log.info("*********************************** EXIT ***********************************");
		return response;

	}

	@PostMapping(value = "/pre-collection-report")
	public Object preCollectionReport(@RequestBody Object request) throws Exception {

		log.info("*********************************** ENTER ***********************************");
		log.info("Entered inside Pre Collection report api request value : {} ", request);
		Object response = restTemplate.postForObject(
				getUrl(applicationProperties.getFabUrl() + "/directdebit/v1/pre-collection-report"),
				new HttpEntity<>(request, GatewayHelper.getHeaders()), Object.class);
		log.info("Response from Pre Collection report api response value : {} ", response);
		log.info("*********************************** EXIT ***********************************");
		return response;

	}

	@PostMapping(value = "/stop-payment")
	public Object stopPayment(@RequestBody Object request) throws Exception {

		log.info("*********************************** ENTER ***********************************");
		log.info("Entered inside stop-payment api request value : {} ", request);
		Object response = restTemplate.postForObject(
				getUrl(applicationProperties.getFabUrl() + "/directdebit/v1/stop-payment"),
				new HttpEntity<>(request, GatewayHelper.getHeaders()), Object.class);
		log.info("Response from stop-payment api response value : {} ", response);
		log.info("*********************************** EXIT ***********************************");
		return response;

	}

	@PostMapping(value = "/report/AB903")
	public Object ab903(@RequestBody Object request) throws Exception {

		log.info("*********************************** ENTER ***********************************");
		log.info("Entered inside report AB903 api request value : {} ", request);
		Object response = restTemplate.postForObject(
				getUrl(applicationProperties.getFabUrl() + "/directdebit/v1/report/AB903"),
				new HttpEntity<>(request, GatewayHelper.getHeaders()), Object.class);
		log.info("Response from report AB903 api response value : {} ", response);
		log.info("*********************************** EXIT ***********************************");
		return response;

	}

	@PostMapping(value = "/report/AB907")
	public Object ab907(@RequestBody Object request) throws Exception {

		log.info("*********************************** ENTER ***********************************");
		log.info("Entered inside report AB907 api request value : {} ", request);
		Object response = restTemplate.postForObject(
				getUrl(applicationProperties.getFabUrl() + "/directdebit/v1/report/AB907"),
				new HttpEntity<>(request, GatewayHelper.getHeaders()), Object.class);
		log.info("Response from report AB903 api response value : {} ", response);
		log.info("*********************************** EXIT ***********************************");
		return response;

	}

	@GetMapping(value = "/cancellation-reasons")
	public Object cancellationReasons(@RequestParam MultiValueMap<String, String> queryParam) throws Exception {

		log.info("*********************************** ENTER ***********************************");
		log.info("Entered inside Cancellation Reasons api queryParam value : {} ", queryParam);

		UriComponentsBuilder builder = UriComponentsBuilder
				.fromHttpUrl(getUrl(applicationProperties.getFabUrl() + "/directdebit/v1/cancellation-reasons"))
				.queryParams(queryParam);

		HttpHeaders headers = new HttpHeaders();
		headers.set("Accept", "application/json");

		Object response = restTemplate.exchange(getUrl(builder.toUriString()), HttpMethod.GET,
				new HttpEntity<>(headers), Object.class);

		log.info("Response from Cancellation Reasons api response value : {} ", response);
		log.info("*********************************** EXIT ***********************************");
		return response;

	}

	@GetMapping(value = "/purpose-codes")
	public Object purposeCodes(@RequestParam MultiValueMap<String, String> queryParam) throws Exception {

		log.info("*********************************** ENTER ***********************************");
		log.info("Entered inside Purpose Codes api queryParam value : {} ", queryParam);

		UriComponentsBuilder builder = UriComponentsBuilder
				.fromHttpUrl(getUrl(applicationProperties.getFabUrl() + "/directdebit/v1/purpose-codes"))
				.queryParams(queryParam);

		HttpHeaders headers = new HttpHeaders();
		headers.set("Accept", "application/json");

		Object response = restTemplate.exchange(getUrl(builder.toUriString()), HttpMethod.GET,
				new HttpEntity<>(headers), Object.class);

		log.info("Response from Purpose Codes api response value : {} ", response);
		log.info("*********************************** EXIT ***********************************");
		return response;

	}

	@GetMapping(value = "/oic-list")
	public Object oicList(@RequestParam MultiValueMap<String, String> queryParam) throws Exception {

		log.info("*********************************** ENTER ***********************************");
		log.info("Entered inside oic list api queryParam value : {} ", queryParam);

		UriComponentsBuilder builder = UriComponentsBuilder
				.fromHttpUrl(getUrl(applicationProperties.getFabUrl() + "/directdebit/v1/oic-list"))
				.queryParams(queryParam);

		HttpHeaders headers = new HttpHeaders();
		headers.set("Accept", "application/json");

		Object response = restTemplate.exchange(getUrl(builder.toUriString()), HttpMethod.GET,
				new HttpEntity<>(headers), Object.class);

		log.info("Response from oic list api response value : {} ", response);
		log.info("*********************************** EXIT ***********************************");
		return response;

	}

}