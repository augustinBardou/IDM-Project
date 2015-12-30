'use strict';

angular.module('videogenApp')
    .factory('VideoGen', function ($resource, DateUtils) {
        return $resource('api/videoGens/:id', {}, {
            'query': { method: 'GET', isArray: true},
            'get': {
                method: 'GET',
                transformResponse: function (data) {
                    data = angular.fromJson(data);
                    return data;
                }
            },
            'update': { method:'PUT' }
        });
    });
