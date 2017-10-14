.PHONY: incubator run-f shell

incubator:
	docker run --rm -it -w="/incubator" -v `pwd`:/incubator clojure bash
run-f:
	docker-compose up
shell:
	docker-compose run app bash
